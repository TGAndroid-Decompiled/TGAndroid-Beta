package defpackage;
public final class g4c implements ez5, dz5 {
    public final a5c a;
    public final r47 b;
    public final v11 c;
    public final zo2 d;

    public g4c(a5c a5cVar, r47 r47Var, v11 v11Var, zo2 zo2Var) {
        this.a = a5cVar;
        this.b = r47Var;
        this.c = v11Var;
        this.d = zo2Var;
    }

    @Override
    public final void a(String str) {
        hl.c3(new uwa(this.a, this.b, str, this.c, this.d, (byte) 8));
    }

    @Override
    public final void l(Exception exc) {
        hl.c3(new kta(this.a, this.b, this.c, this.d, (byte) 16));
    }
}
