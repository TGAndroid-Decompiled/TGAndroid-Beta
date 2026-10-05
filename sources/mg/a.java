package mg;

import org.telegram.ui.Components.r6;
public final class a {
    public final CharSequence f16405a;
    public final int f16406b = 2;
    public final Runnable f16407c;
    public final float d;
    public final float f16408e;
    public final r6 f16409f;

    public a(String str, Runnable runnable) {
        this.f16405a = str;
        this.f16407c = runnable;
    }

    public a(String str) {
        this.f16405a = str;
    }

    public a(String str, float f7, float f10, r6 r6Var) {
        this.f16405a = str;
        this.d = f7;
        this.f16408e = f10;
        this.f16409f = r6Var;
    }
}
