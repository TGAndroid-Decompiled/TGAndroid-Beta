package le;
public final class j {
    public final g f14199a;
    public final n f14200b = new n(0.0f);
    public final n f14201c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f14202f = new n(0.0f);
    public final n f14203g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.f14199a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.f14201c;
        n nVar2 = jVar.f14200b;
        float f7 = 0.0f;
        if (z10) {
            nVar2.f14211c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            nVar.f14211c = f7;
            return;
        }
        nVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        nVar.d(f7);
    }
}
