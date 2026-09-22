package mg;

import org.telegram.ui.Components.p6;
public final class a {
    public final CharSequence f14801a;
    public final int f14802b = 2;
    public final Runnable f14803c;
    public final float d;
    public final float e;
    public final p6 f14804f;

    public a(String str, Runnable runnable) {
        this.f14801a = str;
        this.f14803c = runnable;
    }

    public a(String str) {
        this.f14801a = str;
    }

    public a(String str, float f7, float f10, p6 p6Var) {
        this.f14801a = str;
        this.d = f7;
        this.e = f10;
        this.f14804f = p6Var;
    }
}
