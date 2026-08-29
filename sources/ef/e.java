package ef;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e {
    public static volatile long f5896g;
    public static volatile long h;
    public static final HashSet f5897i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long f5898a;
    public final int f5900c;
    public int d;
    public boolean f5902f;
    public String f5899b = null;
    public final ArrayList f5901e = new ArrayList();

    public e(int i10) {
        this.f5900c = i10;
        this.f5898a = UserConfig.getInstance(i10).clientUserId;
        SharedPreferences d = d();
        try {
            f5896g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new b(this, 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.f22398id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.f5893a = document;
        int i10 = this.d;
        this.d = i10 + 1;
        obj.f5895c = i10;
        obj.d = false;
        this.f5901e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f5902f) {
            f(true);
            this.f5902f = true;
        }
        Utilities.globalQueue.postRunnable(new c(0, this, new ArrayList(this.f5901e)));
    }

    public final TLRPC.Document c(long j10) {
        ArrayList arrayList = this.f5901e;
        if (!this.f5902f) {
            f(true);
            this.f5902f = true;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            try {
                if (arrayList.get(i10) != null && ((d) arrayList.get(i10)).f5893a != null && ((d) arrayList.get(i10)).f5893a.f22398id == j10) {
                    return ((d) arrayList.get(i10)).f5893a;
                }
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.f5899b == null) {
            this.f5899b = "ringtones_pref_" + this.f5898a;
        }
        return ApplicationLoader.applicationContext.getSharedPreferences(this.f5899b, 0);
    }

    public final String e(long j10) {
        if (!this.f5902f) {
            f(true);
            this.f5902f = true;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5901e;
            if (i10 < arrayList.size()) {
                if (((d) arrayList.get(i10)).f5893a != null && ((d) arrayList.get(i10)).f5893a.f22398id == j10) {
                    if (!TextUtils.isEmpty(((d) arrayList.get(i10)).f5894b)) {
                        return ((d) arrayList.get(i10)).f5894b;
                    }
                    return FileLoader.getInstance(this.f5900c).getPathToAttach(((d) arrayList.get(i10)).f5893a).toString();
                }
                i10++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z10) {
        boolean z11;
        SharedPreferences d = d();
        int i10 = d.getInt("count", 0);
        ArrayList arrayList = this.f5901e;
        arrayList.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            String string = d.getString("tone_document" + i11, "");
            String string2 = d.getString("tone_local_path" + i11, "");
            SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.f5893a = TLdeserialize;
                obj.f5894b = string2;
                int i12 = this.d;
                this.d = i12 + 1;
                obj.f5895c = i12;
                arrayList.add(obj);
            } finally {
                if (!z11) {
                }
            }
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new b(this, 1));
        }
    }

    public final void g(boolean z10) {
        boolean z11;
        if (!z10 && System.currentTimeMillis() - h <= 86400000) {
            z11 = false;
        } else {
            z11 = true;
        }
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = f5896g;
        if (z11) {
            ConnectionsManager.getInstance(this.f5900c).sendRequest(getsavedringtones, new a(this, 0));
            return;
        }
        if (!this.f5902f) {
            f(true);
            this.f5902f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f5901e;
            if (i10 < arrayList.size()) {
                if (!((d) arrayList.get(i10)).d) {
                    i11++;
                    TLRPC.Document document = ((d) arrayList.get(i10)).f5893a;
                    String str = ((d) arrayList.get(i10)).f5894b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i10, Utilities.bytesToHex(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i10, str);
                    }
                }
                i10++;
            } else {
                edit.putInt("count", i11);
                edit.apply();
                NotificationCenter.getInstance(this.f5900c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
            }
        }
    }
}
