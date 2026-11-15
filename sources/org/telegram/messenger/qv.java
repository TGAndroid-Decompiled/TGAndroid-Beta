package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class qv extends pv {
    public int d;

    public static void c(qv qvVar, String str, SharedPreferences sharedPreferences) {
        qvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), qvVar.f25992a).putBoolean(str.concat("_save_gallery_video"), qvVar.f25993b).putLong(str.concat("_save_gallery_limitVideo"), qvVar.f25994c).apply();
    }

    public static qv d(String str, SharedPreferences sharedPreferences) {
        ?? pvVar = new pv();
        pvVar.f25992a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        pvVar.f25993b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        pvVar.f25994c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return pvVar;
    }

    @Override
    public final void b() {
        super.b();
        b6.o(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f25992a) {
                sb2.append(hd.M0(2131745920, null));
            }
            if (this.f25993b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.M0(2131745913, null));
                long j3 = this.f25994c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.f25994c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(hd.M0(2131745921, null));
        }
        LongSparseArray m10 = m10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(hd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
