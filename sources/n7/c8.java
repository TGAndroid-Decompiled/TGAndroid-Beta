package n7;
public final class c8 implements u9.d {
    public static final c8 f15295a = new Object();
    public static final u9.c f15296b = new u9.c("inferenceCommonLogEvent", w.c.h(l.d.p(w.class, new s(1))));
    public static final u9.c f15297c = new u9.c("imageInfo", w.c.h(l.d.p(w.class, new s(2))));
    public static final u9.c d = new u9.c("subjectSegmenterOptions", w.c.h(l.d.p(w.class, new s(3))));
    public static final u9.c f15298e = new u9.c("subjectInfos", w.c.h(l.d.p(w.class, new s(4))));
    public static final u9.c f15299f = new u9.c("qualityScores", w.c.h(l.d.p(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        fe feVar = (fe) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(f15296b, feVar.f15344a);
        eVar.e(f15297c, feVar.f15345b);
        eVar.e(d, feVar.f15346c);
        eVar.e(f15298e, feVar.d);
        eVar.e(f15299f, feVar.f15347e);
    }
}
