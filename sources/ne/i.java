package ne;
public final class i {
    public final f f17397a;
    public final m f17398b = new m(0.0f);
    public final m f17399c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f17400f = new m(0.0f);
    public final m f17401g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f17397a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f17399c;
        m mVar2 = iVar.f17398b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f17409c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f17409c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
