package ng;

import org.telegram.ui.Components.s6;
public final class a {
    public final CharSequence f16746a;
    public final int f16747b = 2;
    public final Runnable f16748c;
    public final float d;
    public final float f16749e;
    public final s6 f16750f;

    public a(String str, Runnable runnable) {
        this.f16746a = str;
        this.f16748c = runnable;
    }

    public a(String str) {
        this.f16746a = str;
    }

    public a(String str, float f7, float f10, s6 s6Var) {
        this.f16746a = str;
        this.d = f7;
        this.f16749e = f10;
        this.f16750f = s6Var;
    }
}
