package ng;

import org.telegram.ui.Components.u6;
public final class a {
    public final CharSequence f16063a;
    public final int f16064b = 2;
    public final Runnable f16065c;
    public final float d;
    public final float e;
    public final u6 f16066f;

    public a(String str, Runnable runnable) {
        this.f16063a = str;
        this.f16065c = runnable;
    }

    public a(String str) {
        this.f16063a = str;
    }

    public a(String str, float f7, float f10, u6 u6Var) {
        this.f16063a = str;
        this.d = f7;
        this.e = f10;
        this.f16066f = u6Var;
    }
}
