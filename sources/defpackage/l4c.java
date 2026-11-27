package defpackage;
public final class l4c implements ez5, dz5 {
    public final a5c a;
    public final r47 b;
    public final long c;
    public final int d;

    public l4c(a5c a5cVar, r47 r47Var, long j, int i) {
        this.a = a5cVar;
        this.b = r47Var;
        this.c = j;
        this.d = i;
    }

    @Override
    public final void a(String str) {
        hl.c3(new h4c(this.a, str, this.b, this.c, this.d, (byte) 1));
    }

    @Override
    public final void l(Exception exc) {
        hl.c3(new r77(this.a, this.b, this.c, this.d, (byte) 20));
    }
}
