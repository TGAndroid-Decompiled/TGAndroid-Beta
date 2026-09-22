package le;
public final class i {
    public final f f14198a;
    public final m f14199b = new m(0.0f);
    public final m f14200c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f14201f = new m(0.0f);
    public final m f14202g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f14198a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f14200c;
        m mVar2 = iVar.f14199b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f14210c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f14210c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
