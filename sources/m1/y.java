package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f19516b;
    public final Object f19517c;

    public y(Object obj, int i7) {
        super(1);
        this.f19516b = i7;
        this.f19517c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f19516b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f19517c;
                if (th2 != null) {
                    b0Var.h.h2(new l0(th2));
                }
                if (b0Var.f19346j.f13828b != gd.j.f13830a) {
                    ((i0) b0Var.f19346j.getValue()).close();
                }
                return gd.k.f13831a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f19517c).f10776a, it);
        }
    }
}
