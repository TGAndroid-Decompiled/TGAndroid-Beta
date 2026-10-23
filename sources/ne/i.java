package ne;
public final class i {
    public final f f17460a;
    public final m f17461b = new m(0.0f);
    public final m f17462c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f17463f = new m(0.0f);
    public final m f17464g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f17460a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f17462c;
        m mVar2 = iVar.f17461b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f17472c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f17472c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
