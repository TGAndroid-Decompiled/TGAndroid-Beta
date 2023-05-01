package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC$Chat;
public class CacheByChatsController {
    public static int KEEP_MEDIA_DELETE = 4;
    public static int KEEP_MEDIA_FOREVER = 2;
    public static int KEEP_MEDIA_ONE_DAY = 3;
    public static int KEEP_MEDIA_ONE_MINUTE = 5;
    public static int KEEP_MEDIA_ONE_MONTH = 1;
    public static int KEEP_MEDIA_ONE_WEEK = 0;
    public static final int KEEP_MEDIA_TYPE_CHANNEL = 2;
    public static final int KEEP_MEDIA_TYPE_GROUP = 1;
    public static final int KEEP_MEDIA_TYPE_USER = 0;
    private final int currentAccount;
    int[] keepMediaByTypes = {-1, -1, -1};

    public CacheByChatsController(int i) {
        this.currentAccount = i;
        for (int i2 = 0; i2 < 3; i2++) {
            int[] iArr = this.keepMediaByTypes;
            SharedPreferences preferences = SharedConfig.getPreferences();
            iArr[i2] = preferences.getInt("keep_media_type_" + i2, getDefault(i2));
        }
    }

    public static int getDefault(int i) {
        if (i == 0) {
            return KEEP_MEDIA_FOREVER;
        }
        if (i == 1) {
            return KEEP_MEDIA_ONE_MONTH;
        }
        if (i == 2) {
            return KEEP_MEDIA_ONE_WEEK;
        }
        return SharedConfig.keepMedia;
    }

    public static String getKeepMediaString(int i) {
        if (i == KEEP_MEDIA_ONE_MINUTE) {
            return LocaleController.formatPluralString("Minutes", 1, new Object[0]);
        }
        if (i == KEEP_MEDIA_ONE_DAY) {
            return LocaleController.formatPluralString("Days", 1, new Object[0]);
        }
        if (i == KEEP_MEDIA_ONE_WEEK) {
            return LocaleController.formatPluralString("Weeks", 1, new Object[0]);
        }
        if (i == KEEP_MEDIA_ONE_MONTH) {
            return LocaleController.formatPluralString("Months", 1, new Object[0]);
        }
        return LocaleController.getString("AutoDeleteMediaNever", R.string.AutoDeleteMediaNever);
    }

    public static long getDaysInSeconds(int i) {
        if (i == KEEP_MEDIA_ONE_WEEK) {
            return 604800L;
        }
        if (i == KEEP_MEDIA_ONE_MONTH) {
            return 2592000L;
        }
        if (i == KEEP_MEDIA_ONE_DAY) {
            return 86400L;
        }
        return (i == KEEP_MEDIA_ONE_MINUTE && BuildVars.DEBUG_PRIVATE_VERSION) ? 60L : Long.MAX_VALUE;
    }

    public ArrayList<KeepMediaException> getKeepMediaExceptions(int i) {
        ArrayList<KeepMediaException> arrayList = new ArrayList<>();
        HashSet hashSet = new HashSet();
        SharedPreferences preferences = UserConfig.getInstance(this.currentAccount).getPreferences();
        String string = preferences.getString("keep_media_exceptions_" + i, "");
        if (TextUtils.isEmpty(string)) {
            return arrayList;
        }
        ByteBuffer wrap = ByteBuffer.wrap(Utilities.hexToBytes(string));
        int i2 = wrap.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            KeepMediaException keepMediaException = new KeepMediaException(wrap.getLong(), wrap.getInt());
            if (!hashSet.contains(Long.valueOf(keepMediaException.dialogId))) {
                hashSet.add(Long.valueOf(keepMediaException.dialogId));
                arrayList.add(keepMediaException);
            }
        }
        wrap.clear();
        return arrayList;
    }

    public void saveKeepMediaExceptions(int i, ArrayList<KeepMediaException> arrayList) {
        String str = "keep_media_exceptions_" + i;
        if (arrayList.isEmpty()) {
            UserConfig.getInstance(this.currentAccount).getPreferences().edit().remove(str).apply();
            return;
        }
        int size = arrayList.size();
        ByteBuffer allocate = ByteBuffer.allocate((size * 12) + 4);
        allocate.putInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            allocate.putLong(arrayList.get(i2).dialogId);
            allocate.putInt(arrayList.get(i2).keepMedia);
        }
        UserConfig.getInstance(this.currentAccount).getPreferences().edit().putString(str, Utilities.bytesToHex(allocate.array())).apply();
        allocate.clear();
    }

    public int getKeepMedia(int i) {
        int[] iArr = this.keepMediaByTypes;
        if (iArr[i] == -1) {
            return SharedConfig.keepMedia;
        }
        return iArr[i];
    }

    public void setKeepMedia(int i, int i2) {
        this.keepMediaByTypes[i] = i2;
        SharedPreferences.Editor edit = SharedConfig.getPreferences().edit();
        edit.putInt("keep_media_type_" + i, i2).apply();
    }

    public void lookupFiles(ArrayList<? extends KeepMediaFile> arrayList) {
        int i;
        LongSparseArray<ArrayList<KeepMediaFile>> lookupFiles = FileLoader.getInstance(this.currentAccount).getFileDatabase().lookupFiles(arrayList);
        LongSparseArray<KeepMediaException> keepMediaExceptionsByDialogs = getKeepMediaExceptionsByDialogs();
        for (int i2 = 0; i2 < lookupFiles.size(); i2++) {
            long keyAt = lookupFiles.keyAt(i2);
            ArrayList<KeepMediaFile> valueAt = lookupFiles.valueAt(i2);
            if (keyAt >= 0) {
                i = 0;
            } else {
                long j = -keyAt;
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
                if (chat == null) {
                    chat = MessagesStorage.getInstance(this.currentAccount).getChatSync(j);
                }
                if (chat == null) {
                    i = -1;
                } else {
                    i = ChatObject.isChannel(chat) ? 2 : 1;
                }
            }
            KeepMediaException keepMediaException = keepMediaExceptionsByDialogs.get(keyAt);
            for (int i3 = 0; i3 < valueAt.size(); i3++) {
                KeepMediaFile keepMediaFile = valueAt.get(i3);
                if (i >= 0) {
                    keepMediaFile.dialogType = i;
                }
                if (keepMediaException != null) {
                    keepMediaFile.keepMedia = keepMediaException.keepMedia;
                }
            }
        }
    }

    public LongSparseArray<KeepMediaException> getKeepMediaExceptionsByDialogs() {
        LongSparseArray<KeepMediaException> longSparseArray = new LongSparseArray<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<KeepMediaException> keepMediaExceptions = getKeepMediaExceptions(i);
            if (keepMediaExceptions != null) {
                for (int i2 = 0; i2 < keepMediaExceptions.size(); i2++) {
                    longSparseArray.put(keepMediaExceptions.get(i2).dialogId, keepMediaExceptions.get(i2));
                }
            }
        }
        return longSparseArray;
    }

    public static class KeepMediaException {
        public final long dialogId;
        public int keepMedia;

        public KeepMediaException(long j, int i) {
            this.dialogId = j;
            this.keepMedia = i;
        }
    }

    public static class KeepMediaFile {
        final File file;
        int keepMedia = -1;
        int dialogType = 2;

        public KeepMediaFile(File file) {
            this.file = file;
        }
    }
}
