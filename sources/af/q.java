package af;
public final class q extends ff.a {
    public final df.o f619a = new df.p();
    public final int f620b;
    public boolean f621c;

    public q(int i10) {
        this.f620b = i10;
    }

    @Override
    public final boolean b(df.a aVar) {
        if (this.f621c) {
            df.a aVar2 = (df.a) ((df.p) this.f619a.f6528b);
            return true;
        }
        return true;
    }

    @Override
    public final df.a e() {
        return this.f619a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        boolean z10 = false;
        if (hVar.h) {
            if (((df.p) this.f619a.f6529c) != null) {
                df.a e = hVar.h().e();
                this.f621c = ((e instanceof df.r) || (e instanceof df.o)) ? true : true;
                return a.a(hVar.e);
            }
            return null;
        }
        int i10 = hVar.f571g;
        int i11 = this.f620b;
        if (i10 >= i11) {
            return new a(-1, hVar.f569c + i11, false);
        }
        return null;
    }
}
