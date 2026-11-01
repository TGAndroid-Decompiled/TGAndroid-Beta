package fe;
public final class j {
    public final g f7039a;
    public final n f7040b = new n(0.0f);
    public final n f7041c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f7042f = new n(0.0f);
    public final n f7043g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.f7039a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.f7041c;
        n nVar2 = jVar.f7040b;
        float f7 = 0.0f;
        if (z10) {
            nVar2.f7051c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            nVar.f7051c = f7;
            return;
        }
        nVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        nVar.d(f7);
    }
}
