package ac;

import com.google.android.gms.internal.cast.z5;
public final class g implements r9.d {
    public static final g f492b = new g(0);
    public static final g f493c = new g(1);
    public static final g d = new g(2);
    public final int f494a;

    public g(int i10) {
        this.f494a = i10;
    }

    @Override
    public final Object j2(z5 z5Var) {
        switch (this.f494a) {
            case 0:
                return new e((rb.g) z5Var.a(rb.g.class));
            case 1:
                return new d((e) z5Var.a(e.class), (rb.d) z5Var.a(rb.d.class));
            default:
                return new xb.b(z5Var.b(d.class));
        }
    }
}
