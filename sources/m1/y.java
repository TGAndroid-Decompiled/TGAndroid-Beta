package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f20500b;
    public final Object f20501c;

    public y(Object obj, int i7) {
        super(1);
        this.f20500b = i7;
        this.f20501c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f20500b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f20501c;
                if (th2 != null) {
                    b0Var.h.L(new l0(th2));
                }
                if (b0Var.f20330j.f13514b != gd.j.f13516a) {
                    ((i0) b0Var.f20330j.getValue()).close();
                }
                return gd.k.f13517a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f20501c).f10954a, it);
        }
    }
}
