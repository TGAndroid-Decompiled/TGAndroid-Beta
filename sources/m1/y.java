package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f20562b;
    public final Object f20563c;

    public y(Object obj, int i7) {
        super(1);
        this.f20562b = i7;
        this.f20563c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f20562b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f20563c;
                if (th2 != null) {
                    b0Var.h.E(new l0(th2));
                }
                if (b0Var.f20392j.f13477b != gd.j.f13479a) {
                    ((i0) b0Var.f20392j.getValue()).close();
                }
                return gd.k.f13480a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f20563c).f10915a, it);
        }
    }
}
