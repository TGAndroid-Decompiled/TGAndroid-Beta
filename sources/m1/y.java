package m1;

import java.io.File;
public final class y extends kotlin.jvm.internal.k implements rd.l {
    public final int f20105b;
    public final Object f20106c;

    public y(Object obj, int i7) {
        super(1);
        this.f20105b = i7;
        this.f20106c = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f20105b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                b0 b0Var = (b0) this.f20106c;
                if (th2 != null) {
                    b0Var.h.X(new l0(th2));
                }
                if (b0Var.f19935j.f13170b != gd.j.f13172a) {
                    ((i0) b0Var.f19935j.getValue()).close();
                }
                return gd.k.f13173a;
            default:
                File it = (File) obj;
                kotlin.jvm.internal.j.e(it, "it");
                return new t0(((ee.c) this.f20106c).f10607a, it);
        }
    }
}
