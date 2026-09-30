package le;
public final class j {
    public final g f14230a;
    public final n f14231b = new n(0.0f);
    public final n f14232c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f14233f = new n(0.0f);
    public final n f14234g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.f14230a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.f14232c;
        n nVar2 = jVar.f14231b;
        float f7 = 0.0f;
        if (z10) {
            nVar2.f14242c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            nVar.f14242c = f7;
            return;
        }
        nVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        nVar.d(f7);
    }
}
