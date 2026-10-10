package me;
public final class i {
    public final f f16357a;
    public final m f16358b = new m(0.0f);
    public final m f16359c = new m(0.0f);
    public final m d = new m(0.0f);
    public final m f16360e = new m(0.0f);
    public final m f16361f = new m(0.0f);
    public final m f16362g = new m(0.0f);

    public i(j jVar, f fVar) {
        this.f16357a = fVar;
    }

    public static void a(i iVar, int i10, boolean z10) {
        m mVar = iVar.f16359c;
        m mVar2 = iVar.f16358b;
        float f7 = 0.0f;
        if (z10) {
            mVar2.f16371c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            mVar.f16371c = f7;
            return;
        }
        mVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        mVar.d(f7);
    }
}
