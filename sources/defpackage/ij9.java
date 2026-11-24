package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ij9 {
    public static volatile long g;
    public static volatile long h;
    public static final HashSet i = new HashSet(Arrays.asList("audio/mpeg3", "audio/mpeg", "audio/ogg", "audio/m4a"));
    public final long a;
    public final int c;
    public int d;
    public boolean f;
    public String b = null;
    public final ArrayList e = new ArrayList();

    public ij9(int i2) {
        this.c = i2;
        this.a = y6c.h(i2).n;
        SharedPreferences d = d();
        try {
            g = d.getLong("hash", 0L);
            h = d.getLong("lastReload", 0L);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        gl.d3(new gj9(this, (byte) 0));
    }

    public final void a(TLRPC.Document document) {
        if (document == null || c(document.id) != null) {
            return;
        }
        ?? obj = new Object();
        obj.a = document;
        int i2 = this.d;
        this.d = i2 + 1;
        obj.c = i2;
        obj.d = false;
        this.e.add(obj);
        h();
    }

    public final void b() {
        if (!this.f) {
            f(true);
            this.f = true;
        }
        Utilities.e.c(new lw8(this, new ArrayList(this.e), (byte) 27));
    }

    public final TLRPC.Document c(long j) {
        ArrayList arrayList = this.e;
        if (!this.f) {
            f(true);
            this.f = true;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            try {
                if (arrayList.get(i2) != null && ((hj9) arrayList.get(i2)).a != null && ((hj9) arrayList.get(i2)).a.id == j) {
                    return ((hj9) arrayList.get(i2)).a;
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return null;
            }
        }
        return null;
    }

    public final SharedPreferences d() {
        if (this.b == null) {
            this.b = "ringtones_pref_" + this.a;
        }
        return a.b.getSharedPreferences(this.b, 0);
    }

    public final String e(long j) {
        if (!this.f) {
            f(true);
            this.f = true;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                if (((hj9) arrayList.get(i2)).a != null && ((hj9) arrayList.get(i2)).a.id == j) {
                    if (!TextUtils.isEmpty(((hj9) arrayList.get(i2)).b)) {
                        return ((hj9) arrayList.get(i2)).b;
                    }
                    ba4.G(this.c);
                    return ba4.I(((hj9) arrayList.get(i2)).a).toString();
                }
                i2++;
            } else {
                return "NoSound";
            }
        }
    }

    public final void f(boolean z) {
        SharedPreferences d = d();
        int i2 = d.getInt("count", 0);
        ArrayList arrayList = this.e;
        arrayList.clear();
        for (int i3 = 0; i3 < i2; i3++) {
            String string = d.getString("tone_document" + i3, "");
            String string2 = d.getString("tone_local_path" + i3, "");
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            try {
                TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                ?? obj = new Object();
                obj.a = TLdeserialize;
                obj.b = string2;
                int i4 = this.d;
                this.d = i4 + 1;
                obj.c = i4;
                arrayList.add(obj);
            } catch (Throwable th) {
                boolean z2 = w01.a;
                fa4.g(th, true);
            }
        }
        if (z) {
            gl.d3(new gj9(this, (byte) 1));
        }
    }

    public final void g(boolean z) {
        boolean z2;
        if (!z && System.currentTimeMillis() - h <= 86400000) {
            z2 = false;
        } else {
            z2 = true;
        }
        TL_account.getSavedRingtones getsavedringtones = new TL_account.getSavedRingtones();
        getsavedringtones.hash = g;
        if (z2) {
            ConnectionsManager.getInstance(this.c).sendRequest(getsavedringtones, new n35(this, (byte) 27));
            return;
        }
        if (!this.f) {
            f(true);
            this.f = true;
        }
        b();
    }

    public final void h() {
        SharedPreferences d = d();
        d.edit().clear().apply();
        SharedPreferences.Editor edit = d.edit();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                if (!((hj9) arrayList.get(i2)).d) {
                    i3++;
                    TLRPC.Document document = ((hj9) arrayList.get(i2)).a;
                    String str = ((hj9) arrayList.get(i2)).b;
                    SerializedData serializedData = new SerializedData(document.getObjectSize());
                    document.serializeToStream(serializedData);
                    edit.putString("tone_document" + i2, Utilities.f(serializedData.toByteArray()));
                    if (str != null) {
                        edit.putString("tone_local_path" + i2, str);
                    }
                }
                i2++;
            } else {
                edit.putInt("count", i3);
                edit.apply();
                kk7.f(this.c).k(kk7.g5, new Object[0]);
                return;
            }
        }
    }
}
