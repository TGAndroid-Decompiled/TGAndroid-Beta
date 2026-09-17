package ng;

import org.telegram.ui.Components.s6;
public final class a {
    public final CharSequence f16719a;
    public final int f16720b = 2;
    public final Runnable f16721c;
    public final float d;
    public final float f16722e;
    public final s6 f16723f;

    public a(String str, Runnable runnable) {
        this.f16719a = str;
        this.f16721c = runnable;
    }

    public a(String str) {
        this.f16719a = str;
    }

    public a(String str, float f7, float f10, s6 s6Var) {
        this.f16719a = str;
        this.d = f7;
        this.f16722e = f10;
        this.f16723f = s6Var;
    }
}
