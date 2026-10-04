package le;
public final class i {
    public final f f15452a;
    public final m f15453b = new m(0.0f);
    public final m f15454c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f15455e = new m(0.0f);
    public final m f15456f = new m(0.0f);
    public final m f15457g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f15452a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f15454c;
        m mVar2 = iVar.f15453b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f15466c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f15466c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
