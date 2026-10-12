package me;
public final class i {
    public final f f16103a;
    public final m f16104b = new m(0.0f);
    public final m f16105c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f16106e = new m(0.0f);
    public final m f16107f = new m(0.0f);
    public final m f16108g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f16103a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f16105c;
        m mVar2 = iVar.f16104b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f16117c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f16117c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
