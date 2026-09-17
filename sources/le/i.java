package le;
public final class i {
    public final f f13998a;
    public final m f13999b = new m(0.0f);
    public final m f14000c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f14001f = new m(0.0f);
    public final m f14002g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f13998a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f14000c;
        m mVar2 = iVar.f13999b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f14010c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f14010c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
