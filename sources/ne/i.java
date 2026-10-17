package ne;
public final class i {
    public final f f17393a;
    public final m f17394b = new m(0.0f);
    public final m f17395c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f17396f = new m(0.0f);
    public final m f17397g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f17393a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f17395c;
        m mVar2 = iVar.f17394b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f17405c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f17405c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
