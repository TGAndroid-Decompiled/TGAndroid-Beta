package me;
public final class i {
    public final f f16104a;
    public final m f16105b = new m(0.0f);
    public final m f16106c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f16107e = new m(0.0f);
    public final m f16108f = new m(0.0f);
    public final m f16109g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f16104a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f16106c;
        m mVar2 = iVar.f16105b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f16118c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f16118c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
