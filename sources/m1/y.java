package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f20469b;
    public final Object f20470c;

    public y(Object obj, int i7) {
        super(1);
        this.f20469b = i7;
        this.f20470c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f20469b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f20470c;
                if (th2 != null) {
                    b0Var.h.L(new l0(th2));
                }
                if (b0Var.f20299j.f13482b != gd.j.f13484a) {
                    ((i0) b0Var.f20299j.getValue()).close();
                }
                return gd.k.f13485a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f20470c).f10922a, it);
        }
    }
}
