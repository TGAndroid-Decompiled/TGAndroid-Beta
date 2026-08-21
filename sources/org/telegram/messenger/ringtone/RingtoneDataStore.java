package org.telegram.messenger.ringtone;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public class RingtoneDataStore {
    private static volatile long lastReloadTimeMs;
    private static volatile long queryHash;
    public static final HashSet ringtoneSupportedMimeType = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    private final long clientUserId;
    private final int currentAccount;
    private boolean loaded;
    private int localIds;
    String prefName = null;
    public final ArrayList userRingtones = new ArrayList();

    public RingtoneDataStore(int i) {
        this.currentAccount = i;
        this.clientUserId = UserConfig.getInstance(i).clientUserId;
        SharedPreferences sharedPreferences = getSharedPreferences();
        try {
            queryHash = sharedPreferences.getLong("hash", 0L);
            lastReloadTimeMs = sharedPreferences.getLong("lastReload", 0L);
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.loadUserRingtones(false);
            }
        });
    }

    public void loadUserRingtones(boolean z) {
        boolean z2 = z || System.currentTimeMillis() - lastReloadTimeMs > 86400000;
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = queryHash;
        if (z2) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getsavedringtones, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    RingtoneDataStore.$r8$lambda$QGU0yATPwsS7uQdYgvyA74WZIfw(this.f$0, tLObject, tL_error);
                }
            });
            return;
        }
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        checkRingtoneSoundsLoaded();
    }

    public static void $r8$lambda$QGU0yATPwsS7uQdYgvyA74WZIfw(final RingtoneDataStore ringtoneDataStore, final TLObject tLObject, TLRPC.TL_error tL_error) {
        ringtoneDataStore.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                RingtoneDataStore.$r8$lambda$bpPC8_j31AJsfapIFY8p3AgihY0(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$bpPC8_j31AJsfapIFY8p3AgihY0(RingtoneDataStore ringtoneDataStore, TLObject tLObject) {
        ringtoneDataStore.getClass();
        if (tLObject != null) {
            if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                ringtoneDataStore.loadFromPrefs(true);
            } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                ringtoneDataStore.saveTones(tL_savedRingtones.ringtones);
                SharedPreferences.Editor editorEdit = ringtoneDataStore.getSharedPreferences().edit();
                long j = tL_savedRingtones.hash;
                queryHash = j;
                SharedPreferences.Editor editorPutLong = editorEdit.putLong("hash", j);
                long jCurrentTimeMillis = System.currentTimeMillis();
                lastReloadTimeMs = jCurrentTimeMillis;
                editorPutLong.putLong("lastReload", jCurrentTimeMillis).apply();
            }
            ringtoneDataStore.checkRingtoneSoundsLoaded();
        }
    }

    private void loadFromPrefs(boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        int i = sharedPreferences.getInt("count", 0);
        this.userRingtones.clear();
        for (int i2 = 0; i2 < i; i2++) {
            String string = sharedPreferences.getString("tone_document" + i2, "");
            String string2 = sharedPreferences.getString("tone_local_path" + i2, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document documentTLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                CachedTone cachedTone = new CachedTone();
                cachedTone.document = documentTLdeserialize;
                cachedTone.localUri = string2;
                int i3 = this.localIds;
                this.localIds = i3 + 1;
                cachedTone.localId = i3;
                this.userRingtones.add(cachedTone);
            } catch (Throwable th) {
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    throw th;
                }
                FileLog.e(th);
            }
        }
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationCenter.getInstance(this.f$0.currentAccount).postNotificationName(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                }
            });
        }
    }

    private void saveTones(ArrayList arrayList) {
        TLRPC.Document document;
        if (!this.loaded) {
            loadFromPrefs(false);
            this.loaded = true;
        }
        HashMap map = new HashMap();
        ArrayList arrayList2 = this.userRingtones;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            CachedTone cachedTone = (CachedTone) obj;
            if (cachedTone.localUri != null && (document = cachedTone.document) != null) {
                map.put(Long.valueOf(document.id), cachedTone.localUri);
            }
        }
        this.userRingtones.clear();
        SharedPreferences sharedPreferences = getSharedPreferences();
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt("count", arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList.get(i2);
            String str = (String) map.get(Long.valueOf(document2.id));
            SerializedData serializedData = new SerializedData(document2.getObjectSize());
            document2.serializeToStream(serializedData);
            editorEdit.putString("tone_document" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
            if (str != null) {
                editorEdit.putString("tone_local_path" + i2, str);
            }
            CachedTone cachedTone2 = new CachedTone();
            cachedTone2.document = document2;
            cachedTone2.localUri = str;
            int i3 = this.localIds;
            this.localIds = i3 + 1;
            cachedTone2.localId = i3;
            this.userRingtones.add(cachedTone2);
        }
        editorEdit.apply();
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    public void saveTones() {
        SharedPreferences sharedPreferences = getSharedPreferences();
        sharedPreferences.edit().clear().apply();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        int i = 0;
        for (int i2 = 0; i2 < this.userRingtones.size(); i2++) {
            if (!((CachedTone) this.userRingtones.get(i2)).uploading) {
                i++;
                TLRPC.Document document = ((CachedTone) this.userRingtones.get(i2)).document;
                String str = ((CachedTone) this.userRingtones.get(i2)).localUri;
                SerializedData serializedData = new SerializedData(document.getObjectSize());
                document.serializeToStream(serializedData);
                editorEdit.putString("tone_document" + i2, Utilities.bytesToHex(serializedData.toByteArray()));
                if (str != null) {
                    editorEdit.putString("tone_local_path" + i2, str);
                }
            }
        }
        editorEdit.putInt("count", i);
        editorEdit.apply();
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
    }

    private SharedPreferences getSharedPreferences() {
        if (this.prefName == null) {
            this.prefName = "ringtones_pref_" + this.clientUserId;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.prefName, 0);
    }

    public void addUploadingTone(String str) {
        CachedTone cachedTone = new CachedTone();
        cachedTone.localUri = str;
        int i = this.localIds;
        this.localIds = i + 1;
        cachedTone.localId = i;
        cachedTone.uploading = true;
        this.userRingtones.add(cachedTone);
    }

    public void onRingtoneUploaded(String str, TLRPC.Document document, boolean z) {
        boolean z2 = true;
        if (z) {
            int i = 0;
            while (true) {
                if (i >= this.userRingtones.size()) {
                    z2 = false;
                    break;
                } else {
                    if (((CachedTone) this.userRingtones.get(i)).uploading && str.equals(((CachedTone) this.userRingtones.get(i)).localUri)) {
                        this.userRingtones.remove(i);
                        break;
                    }
                    i++;
                }
            }
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= this.userRingtones.size()) {
                    z2 = false;
                    break;
                } else {
                    if (((CachedTone) this.userRingtones.get(i2)).uploading && str.equals(((CachedTone) this.userRingtones.get(i2)).localUri)) {
                        ((CachedTone) this.userRingtones.get(i2)).uploading = false;
                        ((CachedTone) this.userRingtones.get(i2)).document = document;
                        break;
                    }
                    i2++;
                }
            }
            if (z2) {
                saveTones();
            }
        }
        if (z2) {
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
        }
    }

    public String getSoundPath(long j) {
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        for (int i = 0; i < this.userRingtones.size(); i++) {
            if (((CachedTone) this.userRingtones.get(i)).document != null && ((CachedTone) this.userRingtones.get(i)).document.id == j) {
                if (!TextUtils.isEmpty(((CachedTone) this.userRingtones.get(i)).localUri)) {
                    return ((CachedTone) this.userRingtones.get(i)).localUri;
                }
                return FileLoader.getInstance(this.currentAccount).getPathToAttach(((CachedTone) this.userRingtones.get(i)).document).toString();
            }
        }
        return "NoSound";
    }

    public void checkRingtoneSoundsLoaded() {
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        final ArrayList arrayList = new ArrayList(this.userRingtones);
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                RingtoneDataStore.m1126$r8$lambda$Mdg5w4rlsxgqwUCTRRhNBwi42A(this.f$0, arrayList);
            }
        });
    }

    public static void m1126$r8$lambda$Mdg5w4rlsxgqwUCTRRhNBwi42A(final RingtoneDataStore ringtoneDataStore, ArrayList arrayList) {
        final TLRPC.Document document;
        File pathToAttach;
        ringtoneDataStore.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            CachedTone cachedTone = (CachedTone) arrayList.get(i);
            if (cachedTone != null && ((TextUtils.isEmpty(cachedTone.localUri) || !new File(cachedTone.localUri).exists()) && (document = cachedTone.document) != null && ((pathToAttach = FileLoader.getInstance(ringtoneDataStore.currentAccount).getPathToAttach(document)) == null || !pathToAttach.exists()))) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        RingtoneDataStore ringtoneDataStore2 = this.f$0;
                        TLRPC.Document document2 = document;
                        FileLoader.getInstance(ringtoneDataStore2.currentAccount).loadFile(document2, document2, 0, 0);
                    }
                });
            }
        }
    }

    public boolean isLoaded() {
        return this.loaded;
    }

    public void remove(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        for (int i = 0; i < this.userRingtones.size(); i++) {
            if (((CachedTone) this.userRingtones.get(i)).document != null && ((CachedTone) this.userRingtones.get(i)).document.id == document.id) {
                this.userRingtones.remove(i);
                return;
            }
        }
    }

    public boolean contains(long j) {
        return getDocument(j) != null;
    }

    public void addTone(TLRPC.Document document) {
        if (document == null || contains(document.id)) {
            return;
        }
        CachedTone cachedTone = new CachedTone();
        cachedTone.document = document;
        int i = this.localIds;
        this.localIds = i + 1;
        cachedTone.localId = i;
        cachedTone.uploading = false;
        this.userRingtones.add(cachedTone);
        saveTones();
    }

    public TLRPC.Document getDocument(long j) {
        if (!this.loaded) {
            loadFromPrefs(true);
            this.loaded = true;
        }
        for (int i = 0; i < this.userRingtones.size(); i++) {
            try {
                if (this.userRingtones.get(i) != null && ((CachedTone) this.userRingtones.get(i)).document != null && ((CachedTone) this.userRingtones.get(i)).document.id == j) {
                    return ((CachedTone) this.userRingtones.get(i)).document;
                }
            } catch (Exception e) {
                FileLog.e(e);
                return null;
            }
        }
        return null;
    }

    public class CachedTone {
        public TLRPC.Document document;
        public int localId;
        public String localUri;
        public boolean uploading;

        public CachedTone() {
        }
    }
}
