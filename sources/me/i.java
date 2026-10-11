package me;
public final class i {
    public final f f16381a;
    public final m f16382b = new m(0.0f);
    public final m f16383c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f16384e = new m(0.0f);
    public final m f16385f = new m(0.0f);
    public final m f16386g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f16381a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f16383c;
        m mVar2 = iVar.f16382b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f16395c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f16395c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
