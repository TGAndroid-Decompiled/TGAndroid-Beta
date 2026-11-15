package bi;

import org.telegram.messenger.z10;
public final class j4 implements z10 {
    public final int f3633a;
    public final a6 f3634b;

    public j4(a6 a6Var, int i7) {
        this.f3633a = i7;
        this.f3634b = a6Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f3633a) {
            case 0:
                this.f3634b.k0(((Boolean) obj).booleanValue());
                return;
            default:
                a6.c0(this.f3634b, (Integer) obj);
                return;
        }
    }
}
