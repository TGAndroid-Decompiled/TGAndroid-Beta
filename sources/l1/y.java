package l1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements od.l {
    public final int f17670b;
    public final Object f17671c;

    public y(Object obj, int i3) {
        super(1);
        this.f17670b = i3;
        this.f17671c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f17670b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f17671c;
                if (th2 != null) {
                    b0Var.h.t2(new l0(th2));
                }
                if (b0Var.f17497j.f8798b != dd.j.f8800a) {
                    ((i0) b0Var.f17497j.getValue()).close();
                }
                return dd.k.f8801a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((be.c) this.f17671c).f3259a, it);
        }
    }
}
