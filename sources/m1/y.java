package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f19508b;
    public final Object f19509c;

    public y(Object obj, int i7) {
        super(1);
        this.f19508b = i7;
        this.f19509c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f19508b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f19509c;
                if (th2 != null) {
                    b0Var.h.h2(new l0(th2));
                }
                if (b0Var.f19338j.f13826b != gd.j.f13828a) {
                    ((i0) b0Var.f19338j.getValue()).close();
                }
                return gd.k.f13829a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f19509c).f10771a, it);
        }
    }
}
