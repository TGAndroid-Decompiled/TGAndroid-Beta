package defpackage;
public final class w66 {
    public final t66 a;
    public final bbc b = new bbc(0.0f);
    public final bbc c = new bbc(0.0f);
    public final bbc d = new bbc(0.0f);
    public final bbc e = new bbc(0.0f);
    public final bbc f = new bbc(0.0f);
    public final bbc g = new bbc(0.0f);

    public w66(x66 x66Var, t66 t66Var) {
        this.a = t66Var;
    }

    public final void a(int i, boolean z) {
        float f = 0.0f;
        bbc bbcVar = this.c;
        bbc bbcVar2 = this.b;
        if (z) {
            bbcVar2.c = i;
            if (i > 0) {
                f = 1.0f;
            }
            bbcVar.c = f;
            return;
        }
        bbcVar2.d(i);
        if (i > 0) {
            f = 1.0f;
        }
        bbcVar.d(f);
    }
}
