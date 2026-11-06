package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class sv extends rv {
    public int d;

    public static void c(sv svVar, String str, SharedPreferences sharedPreferences) {
        svVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), svVar.f25342a).putBoolean(str.concat("_save_gallery_video"), svVar.f25343b).putLong(str.concat("_save_gallery_limitVideo"), svVar.f25344c).apply();
    }

    public static sv d(String str, SharedPreferences sharedPreferences) {
        ?? rvVar = new rv();
        rvVar.f25342a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        rvVar.f25343b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        rvVar.f25344c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return rvVar;
    }

    @Override
    public final void b() {
        super.b();
        b6.m(this.d);
    }

    public final CharSequence e(int i7) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f25342a) {
                sb2.append(hd.M0(2131745921, null));
            }
            if (this.f25343b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(hd.M0(2131745914, null));
                long j3 = this.f25344c;
                if (j3 > 0 && j3 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(g0.i0(this.f25344c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(hd.M0(2131745922, null));
        }
        LongSparseArray m10 = p10.i(i7).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(hd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
