package le;
public final class j {
    public final g f14215a;
    public final n f14216b = new n(0.0f);
    public final n f14217c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f14218f = new n(0.0f);
    public final n f14219g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.f14215a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.f14217c;
        n nVar2 = jVar.f14216b;
        float f7 = 0.0f;
        if (z10) {
            nVar2.f14227c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            nVar.f14227c = f7;
            return;
        }
        nVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        nVar.d(f7);
    }
}
