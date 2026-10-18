package ne;
public final class i {
    public final f f17400a;
    public final m f17401b = new m(0.0f);
    public final m f17402c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f17403f = new m(0.0f);
    public final m f17404g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f17400a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f17402c;
        m mVar2 = iVar.f17401b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f17412c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f17412c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
