package le;
public final class i {
    public final f f12883a;
    public final m f12884b = new m(0.0f);
    public final m f12885c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f12886f = new m(0.0f);
    public final m f12887g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f12883a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f12885c;
        m mVar2 = iVar.f12884b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f12895c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f12895c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
