package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class CacheByChatsController {
    public static int KEEP_MEDIA_DELETE = 4;
    public static int KEEP_MEDIA_FOREVER = 2;
    public static int KEEP_MEDIA_ONE_DAY = 3;
    public static int KEEP_MEDIA_ONE_MINUTE = 5;
    public static int KEEP_MEDIA_ONE_MONTH = 1;
    public static int KEEP_MEDIA_ONE_WEEK = 0;
    public static int KEEP_MEDIA_TWO_DAY = 6;
    public static final int KEEP_MEDIA_TYPE_CHANNEL = 2;
    public static final int KEEP_MEDIA_TYPE_GROUP = 1;
    public static final int KEEP_MEDIA_TYPE_STORIES = 3;
    public static final int KEEP_MEDIA_TYPE_USER = 0;
    private final int currentAccount;
    private boolean gotKeepMediaByTypes = false;
    private final int[] keepMediaByTypes = {-1, -1, -1, -1};

    public static class KeepMediaException {
        public final long dialogId;
        public int keepMedia;

        public KeepMediaException(long j10, int i9) {
            this.dialogId = j10;
            this.keepMedia = i9;
        }
    }

    public static class KeepMediaFile {
        final File file;
        boolean isStory;
        int keepMedia = -1;
        int dialogType = 2;

        public KeepMediaFile(File file) {
            this.file = file;
        }
    }

    public CacheByChatsController(int i9) {
        this.currentAccount = i9;
    }

    public static long getDaysInSeconds(int i9) {
        if (i9 == KEEP_MEDIA_ONE_WEEK) {
            return 604800L;
        }
        if (i9 == KEEP_MEDIA_ONE_MONTH) {
            return 2592000L;
        }
        if (i9 == KEEP_MEDIA_ONE_DAY) {
            return 86400L;
        }
        if (i9 == KEEP_MEDIA_TWO_DAY) {
            return 172800L;
        }
        if (i9 == KEEP_MEDIA_ONE_MINUTE && BuildVars.DEBUG_PRIVATE_VERSION) {
            return 60L;
        }
        return Long.MAX_VALUE;
    }

    public static int getDefault(int i9) {
        if (i9 == 0) {
            return KEEP_MEDIA_FOREVER;
        }
        if (i9 == 1) {
            return KEEP_MEDIA_ONE_MONTH;
        }
        if (i9 == 2) {
            return KEEP_MEDIA_ONE_WEEK;
        }
        if (i9 == 3) {
            return KEEP_MEDIA_TWO_DAY;
        }
        return SharedConfig.keepMedia;
    }

    public static String getKeepMediaString(int i9) {
        if (i9 == KEEP_MEDIA_ONE_MINUTE) {
            return LocaleController.formatPluralString("Minutes", 1, new Object[0]);
        }
        if (i9 == KEEP_MEDIA_ONE_DAY) {
            return LocaleController.formatPluralString("Days", 1, new Object[0]);
        }
        if (i9 == KEEP_MEDIA_TWO_DAY) {
            return LocaleController.formatPluralString("Days", 2, new Object[0]);
        }
        if (i9 == KEEP_MEDIA_ONE_WEEK) {
            return LocaleController.formatPluralString("Weeks", 1, new Object[0]);
        }
        if (i9 == KEEP_MEDIA_ONE_MONTH) {
            return LocaleController.formatPluralString("Months", 1, new Object[0]);
        }
        return LocaleController.getString(R.string.AutoDeleteMediaNever);
    }

    public int getKeepMedia(int i9) {
        if (!this.gotKeepMediaByTypes) {
            this.gotKeepMediaByTypes = true;
            for (int i10 = 0; i10 < 4; i10++) {
                this.keepMediaByTypes[i10] = SharedConfig.getPreferences().getInt(j3.r0.l(i10, "keep_media_type_"), getDefault(i10));
            }
        }
        int i11 = this.keepMediaByTypes[i9];
        if (i11 == -1) {
            return SharedConfig.keepMedia;
        }
        return i11;
    }

    public ArrayList<KeepMediaException> getKeepMediaExceptions(int i9) {
        ArrayList<KeepMediaException> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        SharedPreferences preferences = UserConfig.getInstance(this.currentAccount).getPreferences();
        String string = preferences.getString("keep_media_exceptions_" + i9, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.hexToBytes(string));
        int i10 = wrap.getInt();
        for (int i11 = 0; i11 < i10; i11++) {
            KeepMediaException keepMediaException = new KeepMediaException(wrap.getLong(), wrap.getInt());
            if (!hashSet.contains(Long.valueOf(keepMediaException.dialogId))) {
                hashSet.add(Long.valueOf(keepMediaException.dialogId));
                arrayList.add(keepMediaException);
            }
        }
        wrap.clear();
        return arrayList;
    }

    public LongSparseArray<KeepMediaException> getKeepMediaExceptionsByDialogs() {
        LongSparseArray<KeepMediaException> longSparseArray = new LongSparseArray<>();
        for (int i9 = 0; i9 < 3; i9++) {
            ArrayList<KeepMediaException> keepMediaExceptions = getKeepMediaExceptions(i9);
            if (keepMediaExceptions != null) {
                for (int i10 = 0; i10 < keepMediaExceptions.size(); i10++) {
                    longSparseArray.put(keepMediaExceptions.get(i10).dialogId, keepMediaExceptions.get(i10));
                }
            }
        }
        return longSparseArray;
    }

    public void lookupFiles(ArrayList<? extends KeepMediaFile> arrayList) {
        int i9;
        LongSparseArray<ArrayList<KeepMediaFile>> lookupFiles = FileLoader.getInstance(this.currentAccount).getFileDatabase().lookupFiles(arrayList);
        LongSparseArray<KeepMediaException> keepMediaExceptionsByDialogs = getKeepMediaExceptionsByDialogs();
        for (int i10 = 0; i10 < lookupFiles.size(); i10++) {
            long keyAt = lookupFiles.keyAt(i10);
            ArrayList<KeepMediaFile> valueAt = lookupFiles.valueAt(i10);
            if (keyAt >= 0) {
                i9 = 0;
            } else {
                long j10 = -keyAt;
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                if (chat == null) {
                    chat = MessagesStorage.getInstance(this.currentAccount).getChatSync(j10);
                }
                if (chat == null) {
                    i9 = -1;
                } else if (ChatObject.isChannel(chat)) {
                    i9 = 2;
                } else {
                    i9 = 1;
                }
            }
            KeepMediaException keepMediaException = keepMediaExceptionsByDialogs.get(keyAt);
            for (int i11 = 0; i11 < valueAt.size(); i11++) {
                KeepMediaFile keepMediaFile = valueAt.get(i11);
                if (i9 >= 0) {
                    keepMediaFile.dialogType = i9;
                }
                if (keepMediaException != null) {
                    keepMediaFile.keepMedia = keepMediaException.keepMedia;
                }
            }
        }
    }

    public void saveKeepMediaExceptions(int i9, ArrayList<KeepMediaException> arrayList) {
        String l10 = j3.r0.l(i9, "keep_media_exceptions_");
        if (arrayList.isEmpty()) {
            UserConfig.getInstance(this.currentAccount).getPreferences().edit().remove(l10).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            allocate.putLong(arrayList.get(i10).dialogId);
            allocate.putInt(arrayList.get(i10).keepMedia);
        }
        UserConfig.getInstance(this.currentAccount).getPreferences().edit().putString(l10, Utilities.bytesToHex(allocate.array())).apply();
        allocate.clear();
    }

    public void setKeepMedia(int i9, int i10) {
        if (!this.gotKeepMediaByTypes) {
            this.gotKeepMediaByTypes = true;
            for (int i11 = 0; i11 < 4; i11++) {
                this.keepMediaByTypes[i11] = SharedConfig.getPreferences().getInt(j3.r0.l(i11, "keep_media_type_"), getDefault(i11));
            }
        }
        this.keepMediaByTypes[i9] = i10;
        SharedPreferences.Editor edit = SharedConfig.getPreferences().edit();
        edit.putInt("keep_media_type_" + i9, i10).apply();
    }
}
