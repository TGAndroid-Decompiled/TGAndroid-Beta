package mg;

import org.telegram.ui.Components.r6;
public final class a {
    public final CharSequence f16400a;
    public final int f16401b = 2;
    public final Runnable f16402c;
    public final float d;
    public final float f16403e;
    public final r6 f16404f;

    public a(String str, Runnable runnable) {
        this.f16400a = str;
        this.f16402c = runnable;
    }

    public a(String str) {
        this.f16400a = str;
    }

    public a(String str, float f7, float f10, r6 r6Var) {
        this.f16400a = str;
        this.d = f7;
        this.f16403e = f10;
        this.f16404f = r6Var;
    }
}
