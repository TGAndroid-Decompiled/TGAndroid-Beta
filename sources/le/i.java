package le;
public final class i {
    public final f f15411a;
    public final m f15412b = new m(0.0f);
    public final m f15413c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f15414e = new m(0.0f);
    public final m f15415f = new m(0.0f);
    public final m f15416g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f15411a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f15413c;
        m mVar2 = iVar.f15412b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f15425c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f15425c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
