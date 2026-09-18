package le;
public final class i {
    public final f f14144a;
    public final m f14145b = new m(0.0f);
    public final m f14146c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f14147f = new m(0.0f);
    public final m f14148g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f14144a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f14146c;
        m mVar2 = iVar.f14145b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f14156c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f14156c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
