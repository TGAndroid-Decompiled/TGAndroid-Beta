package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class dw extends cw {
    public int d;

    public static void c(dw dwVar, String str, SharedPreferences sharedPreferences) {
        dwVar.getClass();
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), dwVar.f15091a).putBoolean(str.concat("_save_gallery_video"), dwVar.f15092b).putLong(str.concat("_save_gallery_limitVideo"), dwVar.f15093c).apply();
    }

    public static dw d(String str, SharedPreferences sharedPreferences) {
        ?? cwVar = new cw();
        cwVar.f15091a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        cwVar.f15092b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        cwVar.f15093c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return cwVar;
    }

    @Override
    public final void b() {
        super.b();
        js.n(this.d);
    }

    public final CharSequence e(int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (a()) {
            if (this.f15091a) {
                sb2.append(cd.L0(2131745937, null));
            }
            if (this.f15092b) {
                if (sb2.length() != 0) {
                    sb2.append(", ");
                }
                sb2.append(cd.L0(2131745930, null));
                long j10 = this.f15093c;
                if (j10 > 0 && j10 < 4194304000L) {
                    sb2.append(" (");
                    sb2.append(i0.i0(this.f15093c, true, false));
                    sb2.append(")");
                }
            }
        } else {
            sb2.append(cd.L0(2131745938, null));
        }
        LongSparseArray m10 = d20.i(i10).m(this.d);
        if (m10.size() != 0) {
            if (sb2.length() != 0) {
                sb2.append(", ");
            }
            sb2.append(cd.G(m10.size(), "Exception", Integer.valueOf(m10.size())));
        }
        return sb2;
    }
}
