package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class kv extends jv {
    public int d;

    public static void c(kv kvVar, String str, SharedPreferences sharedPreferences) {
        kvVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), kvVar.f23727a).putBoolean(str.concat("_save_gallery_video"), kvVar.f23728b).putLong(str.concat("_save_gallery_limitVideo"), kvVar.f23729c).apply();
    }

    public static kv d(String str, SharedPreferences sharedPreferences) {
        ?? jvVar = new jv();
        jvVar.f23727a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        jvVar.f23728b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        jvVar.f23729c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return jvVar;
    }

    @Override
    public final void b() {
        super.b();
        b6.m(this.d);
    }

    public final CharSequence e(int i3) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f23727a) {
                sb2.append(bd.M0(2131745930, null));
            }
            if (this.f23728b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(bd.M0(2131745923, null));
                long j10 = this.f23729c;
                if (j10 > 0 && j10 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.f23729c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(bd.M0(2131745931, null));
        }
        LongSparseArray m10 = h10.i(i3).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(bd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
