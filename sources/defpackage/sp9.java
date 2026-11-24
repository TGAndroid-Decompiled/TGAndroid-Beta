package defpackage;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
public final class sp9 extends rp9 {
    public byte d;

    public static sp9 d(String str, SharedPreferences sharedPreferences) {
        ?? rp9Var = new rp9();
        rp9Var.a = sharedPreferences.getBoolean(str.concat("_save_gallery_photo"), false);
        rp9Var.b = sharedPreferences.getBoolean(str.concat("_save_gallery_video"), false);
        rp9Var.c = sharedPreferences.getLong(str.concat("_save_gallery_limitVideo"), 104857600L);
        return rp9Var;
    }

    @Override
    public final void b() {
        super.b();
        mte.f(this.d);
    }

    public final CharSequence c(int i) {
        StringBuilder sb = new StringBuilder();
        if (a()) {
            if (this.a) {
                sb.append(k96.M0(2131745728, null));
            }
            if (this.b) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(k96.M0(2131745721, null));
                long j = this.c;
                if (j > 0 && j < 4194304000L) {
                    sb.append(" (");
                    sb.append(gl.i0(this.c, true, false));
                    sb.append(")");
                }
            }
        } else {
            sb.append(k96.M0(2131745729, null));
        }
        LongSparseArray l = y6c.h(i).l(this.d);
        if (l.size() != 0) {
            if (sb.length() != 0) {
                sb.append(", ");
            }
            sb.append(k96.G(l.size(), "Exception", Integer.valueOf(l.size())));
        }
        return sb;
    }

    public final void e(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(str.concat("_save_gallery_photo"), this.a).putBoolean(str.concat("_save_gallery_video"), this.b).putLong(str.concat("_save_gallery_limitVideo"), this.c).apply();
    }
}
