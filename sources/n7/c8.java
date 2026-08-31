package n7;
public final class c8 implements u9.d {
    public static final c8 f15293a = new Object();
    public static final u9.c f15294b = new u9.c("inferenceCommonLogEvent", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15295c = new u9.c("imageInfo", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("subjectSegmenterOptions", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15296e = new u9.c("subjectInfos", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f15297f = new u9.c("qualityScores", w.c.h(l.d.p(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        fe feVar = (fe) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15294b, feVar.f15342a);
        eVar.e(f15295c, feVar.f15343b);
        eVar.e(d, feVar.f15344c);
        eVar.e(f15296e, feVar.d);
        eVar.e(f15297f, feVar.f15345e);
    }
}
