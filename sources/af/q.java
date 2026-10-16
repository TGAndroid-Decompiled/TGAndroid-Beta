package af;
public final class q extends ff.a {
    public final df.o f623a = new df.p();
    public final int f624b;
    public boolean f625c;

    public q(int i10) {
        this.f624b = i10;
    }

    @Override
    public final boolean b(df.a aVar) {
        if (this.f625c) {
            df.a aVar2 = (df.a) ((df.p) this.f623a.f6531b);
            return true;
        }
        return true;
    }

    @Override
    public final df.a e() {
        return this.f623a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(h hVar) {
        boolean z10 = false;
        if (hVar.h) {
            if (((df.p) this.f623a.f6532c) != null) {
                df.a e = hVar.h().e();
                this.f625c = ((e instanceof df.r) || (e instanceof df.o)) ? true : true;
                return a.a(hVar.e);
            }
            return null;
        }
        int i10 = hVar.f575g;
        int i11 = this.f624b;
        if (i10 >= i11) {
            return new a(-1, hVar.f573c + i11, false);
        }
        return null;
    }
}
