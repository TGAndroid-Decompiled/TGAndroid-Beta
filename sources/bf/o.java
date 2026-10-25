package bf;

import ef.r;
public final class o extends gf.a {
    public final ef.o f3970a = new ef.p();
    public final int f3971b;
    public boolean f3972c;

    public o(int i10) {
        this.f3971b = i10;
    }

    @Override
    public final boolean b(ef.a aVar) {
        if (this.f3972c) {
            ef.a aVar2 = (ef.a) ((ef.p) this.f3970a.f9937b);
            return true;
        }
        return true;
    }

    @Override
    public final ef.a e() {
        return this.f3970a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final a h(g gVar) {
        boolean z10 = false;
        if (gVar.h) {
            if (((ef.p) this.f3970a.f9938c) != null) {
                ef.a e = gVar.h().e();
                this.f3972c = ((e instanceof r) || (e instanceof ef.o)) ? true : true;
                return a.a(gVar.e);
            }
            return null;
        }
        int i10 = gVar.f3925g;
        int i11 = this.f3971b;
        if (i10 >= i11) {
            return new a(-1, gVar.f3923c + i11, false);
        }
        return null;
    }
}
