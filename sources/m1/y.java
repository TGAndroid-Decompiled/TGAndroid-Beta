package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f20472b;
    public final Object f20473c;

    public y(Object obj, int i7) {
        super(1);
        this.f20472b = i7;
        this.f20473c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f20472b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f20473c;
                if (th2 != null) {
                    b0Var.h.L(new l0(th2));
                }
                if (b0Var.f20302j.f13485b != gd.j.f13487a) {
                    ((i0) b0Var.f20302j.getValue()).close();
                }
                return gd.k.f13488a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f20473c).f10925a, it);
        }
    }
}
