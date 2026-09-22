package le;
public final class i {
    public final f f13986a;
    public final m f13987b = new m(0.0f);
    public final m f13988c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f13989f = new m(0.0f);
    public final m f13990g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f13986a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f13988c;
        m mVar2 = iVar.f13987b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f13998c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f13998c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
