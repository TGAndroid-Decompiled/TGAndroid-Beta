package l7;
public final class x8 implements s9.d {
    public static final x8 f15043a = new Object();
    public static final s9.c f15044b = new s9.c("isForegroundConfidenceMaskEnabled", u3.c.h(j7.l1.q(w.class, new s(1))));
    public static final s9.c f15045c = new s9.c("isForegroundBitmapEnabled", u3.c.h(j7.l1.q(w.class, new s(2))));
    public static final s9.c d = new s9.c("isMultipleSubjectsEnabled", u3.c.h(j7.l1.q(w.class, new s(3))));
    public static final s9.c f15046e = new s9.c("isSubjectConfidenceMaskEnabled", u3.c.h(j7.l1.q(w.class, new s(4))));
    public static final s9.c f15047f = new s9.c("isSubjectBitmapEnabled", u3.c.h(j7.l1.q(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ve veVar = (ve) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f15044b, veVar.f15002a);
        eVar.e(f15045c, veVar.f15003b);
        eVar.e(d, veVar.f15004c);
        eVar.e(f15046e, veVar.d);
        eVar.e(f15047f, veVar.f15005e);
    }
}
