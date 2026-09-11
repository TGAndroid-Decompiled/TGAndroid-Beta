package le;
public final class i {
    public final f f15384a;
    public final m f15385b = new m(0.0f);
    public final m f15386c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f15387e = new m(0.0f);
    public final m f15388f = new m(0.0f);
    public final m f15389g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f15384a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f15386c;
        m mVar2 = iVar.f15385b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f15398c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f15398c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
