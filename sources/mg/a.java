package mg;

import org.telegram.ui.Components.p6;
public final class a {
    public final CharSequence f14803a;
    public final int f14804b = 2;
    public final Runnable f14805c;
    public final float d;
    public final float e;
    public final p6 f14806f;

    public a(String str, Runnable runnable) {
        this.f14803a = str;
        this.f14805c = runnable;
    }

    public a(String str) {
        this.f14803a = str;
    }

    public a(String str, float f7, float f10, p6 p6Var) {
        this.f14803a = str;
        this.d = f7;
        this.e = f10;
        this.f14806f = p6Var;
    }
}
