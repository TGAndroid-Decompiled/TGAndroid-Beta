package fe;
public final class j {
    public final g f7038a;
    public final n f7039b = new n(0.0f);
    public final n f7040c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f7041f = new n(0.0f);
    public final n f7042g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.f7038a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.f7040c;
        n nVar2 = jVar.f7039b;
        float f7 = 0.0f;
        if (z10) {
            nVar2.f7050c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            nVar.f7050c = f7;
            return;
        }
        nVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        nVar.d(f7);
    }
}
