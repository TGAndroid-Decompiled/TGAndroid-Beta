package cc;

import com.google.android.gms.internal.cast.z5;
import rb.g;
public final class a implements r9.d {
    public static final a f4710b = new a(0);
    public static final a f4711c = new a(1);
    public final int f4712a;

    public a(int i10) {
        this.f4712a = i10;
    }

    @Override
    public final Object j2(z5 z5Var) {
        switch (this.f4712a) {
            case 0:
                return new c((g) z5Var.a(g.class));
            default:
                return new b((c) z5Var.a(c.class), (rb.d) z5Var.a(rb.d.class));
        }
    }
}
