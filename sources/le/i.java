package le;
public final class i {
    public final f f13988a;
    public final m f13989b = new m(0.0f);
    public final m f13990c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f13991f = new m(0.0f);
    public final m f13992g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f13988a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f13990c;
        m mVar2 = iVar.f13989b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f14000c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f14000c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
