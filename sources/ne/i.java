package ne;
public final class i {
    public final f f17396a;
    public final m f17397b = new m(0.0f);
    public final m f17398c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f17399f = new m(0.0f);
    public final m f17400g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f17396a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f17398c;
        m mVar2 = iVar.f17397b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f17408c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f17408c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
