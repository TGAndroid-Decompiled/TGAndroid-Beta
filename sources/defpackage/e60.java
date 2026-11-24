package defpackage;
public final class e60 implements zn7 {
    public static final e60 a = new Object();
    public static final w84 b = w84.c("type");
    public static final w84 c = w84.c("reason");
    public static final w84 d = w84.c("frames");
    public static final w84 e = w84.c("causedBy");
    public static final w84 f = w84.c("overflowCount");

    @Override
    public final void a(Object obj, Object obj2) {
        ry2 ry2Var = (ry2) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, ((w80) ry2Var).a);
        w80 w80Var = (w80) ry2Var;
        ao7Var.a(c, w80Var.b);
        ao7Var.a(d, w80Var.c);
        ao7Var.a(e, w80Var.d);
        ao7Var.e(f, w80Var.e);
    }
}
