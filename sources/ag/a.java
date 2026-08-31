package ag;

import org.telegram.ui.Components.m6;
public final class a {
    public final CharSequence f187a;
    public final int f188b = 2;
    public final Runnable f189c;
    public final float d;
    public final float f190e;
    public final m6 f191f;

    public a(String str, Runnable runnable) {
        this.f187a = str;
        this.f189c = runnable;
    }

    public a(String str) {
        this.f187a = str;
    }

    public a(String str, float f10, float f11, m6 m6Var) {
        this.f187a = str;
        this.d = f10;
        this.f190e = f11;
        this.f191f = m6Var;
    }
}
