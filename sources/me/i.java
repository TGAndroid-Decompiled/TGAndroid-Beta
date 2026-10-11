package me;
public final class i {
    public final f f16417a;
    public final m f16418b = new m(0.0f);
    public final m f16419c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f16420e = new m(0.0f);
    public final m f16421f = new m(0.0f);
    public final m f16422g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f16417a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f16419c;
        m mVar2 = iVar.f16418b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f16431c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f16431c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
