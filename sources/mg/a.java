package mg;

import org.telegram.ui.Components.t6;
public final class a {
    public final CharSequence f16158a;
    public final int f16159b = 2;
    public final Runnable f16160c;
    public final float d;
    public final float f16161e;
    public final t6 f16162f;

    public a(String str, Runnable runnable) {
        this.f16158a = str;
        this.f16160c = runnable;
    }

    public a(String str) {
        this.f16158a = str;
    }

    public a(String str, float f7, float f10, t6 t6Var) {
        this.f16158a = str;
        this.d = f7;
        this.f16161e = f10;
        this.f16162f = t6Var;
    }
}
