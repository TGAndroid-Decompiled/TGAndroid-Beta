package oe;
public final class i {
    public final f f19340a;
    public final m f19341b = new m(0.0f);
    public final m f19342c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f19343f = new m(0.0f);
    public final m f19344g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f19340a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f19342c;
        m mVar2 = iVar.f19341b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f19352c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f19352c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
