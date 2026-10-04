package le;
public final class i {
    public final f f15450a;
    public final m f15451b = new m(0.0f);
    public final m f15452c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f15453e = new m(0.0f);
    public final m f15454f = new m(0.0f);
    public final m f15455g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f15450a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f15452c;
        m mVar2 = iVar.f15451b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f15464c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f15464c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
