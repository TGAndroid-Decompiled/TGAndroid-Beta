package ng;

import org.telegram.ui.Components.u6;
public final class a {
    public final CharSequence f16352a;
    public final int f16353b = 2;
    public final Runnable f16354c;
    public final float d;
    public final float e;
    public final u6 f16355f;

    public a(String str, Runnable runnable) {
        this.f16352a = str;
        this.f16354c = runnable;
    }

    public a(String str) {
        this.f16352a = str;
    }

    public a(String str, float f7, float f10, u6 u6Var) {
        this.f16352a = str;
        this.d = f7;
        this.e = f10;
        this.f16355f = u6Var;
    }
}
