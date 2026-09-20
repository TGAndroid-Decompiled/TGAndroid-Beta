package le;
public final class i {
    public final f f14183a;
    public final m f14184b = new m(0.0f);
    public final m f14185c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f14186f = new m(0.0f);
    public final m f14187g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f14183a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f14185c;
        m mVar2 = iVar.f14184b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f14195c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f14195c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
