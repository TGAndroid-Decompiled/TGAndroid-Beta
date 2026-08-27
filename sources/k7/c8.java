package k7;

public final class c8 implements r9.d {

    public static final c8 f14519a = new c8();

    public static final r9.c f14520b = new r9.c("inferenceCommonLogEvent", s3.c.h(i0.a.s(w.class, new s(1))));

    public static final r9.c f14521c = new r9.c("imageInfo", s3.c.h(i0.a.s(w.class, new s(2))));
    public static final r9.c d = new r9.c("subjectSegmenterOptions", s3.c.h(i0.a.s(w.class, new s(3))));

    public static final r9.c f14522e = new r9.c("subjectInfos", s3.c.h(i0.a.s(w.class, new s(4))));

    public static final r9.c f14523f = new r9.c("qualityScores", s3.c.h(i0.a.s(w.class, new s(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        ee eeVar = (ee) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f14520b, eeVar.f14557a);
        eVar.a(f14521c, eeVar.f14558b);
        eVar.a(d, eeVar.f14559c);
        eVar.a(f14522e, eeVar.d);
        eVar.a(f14523f, eeVar.f14560e);
    }
}
