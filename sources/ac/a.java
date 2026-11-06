package ac;

import a8.r7;
import pb.g;
public final class a implements u9.d {
    public static final a f1012b = new a(0);
    public static final a f1013c = new a(1);
    public final int f1014a;

    public a(int i7) {
        this.f1014a = i7;
    }

    @Override
    public final Object e(r7 r7Var) {
        switch (this.f1014a) {
            case 0:
                return new c((g) r7Var.a(g.class));
            default:
                return new b((c) r7Var.a(c.class), (pb.d) r7Var.a(pb.d.class));
        }
    }
}
