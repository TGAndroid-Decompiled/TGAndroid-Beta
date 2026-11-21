package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f20497b;
    public final Object f20498c;

    public y(Object obj, int i7) {
        super(1);
        this.f20497b = i7;
        this.f20498c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f20497b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f20498c;
                if (th2 != null) {
                    b0Var.h.L(new l0(th2));
                }
                if (b0Var.f20327j.f13511b != gd.j.f13513a) {
                    ((i0) b0Var.f20327j.getValue()).close();
                }
                return gd.k.f13514a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f20498c).f10951a, it);
        }
    }
}
