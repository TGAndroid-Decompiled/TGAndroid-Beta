package le;
public final class j {
    public final g f14214a;
    public final n f14215b = new n(0.0f);
    public final n f14216c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f14217f = new n(0.0f);
    public final n f14218g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.f14214a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.f14216c;
        n nVar2 = jVar.f14215b;
        float f7 = 0.0f;
        if (z10) {
            nVar2.f14226c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            nVar.f14226c = f7;
            return;
        }
        nVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        nVar.d(f7);
    }
}
