package me;
public final class i {
    public final f f16353a;
    public final m f16354b = new m(0.0f);
    public final m f16355c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f16356e = new m(0.0f);
    public final m f16357f = new m(0.0f);
    public final m f16358g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f16353a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f16355c;
        m mVar2 = iVar.f16354b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f16367c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f16367c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
