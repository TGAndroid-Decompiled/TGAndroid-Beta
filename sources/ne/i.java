package ne;
public final class i {
    public final f f16017a;
    public final m f16018b = new m(0.0f);
    public final m f16019c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m e = new m(0.0f);
    public final m f16020f = new m(0.0f);
    public final m f16021g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f16017a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f16019c;
        m mVar2 = iVar.f16018b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f16029c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f16029c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
