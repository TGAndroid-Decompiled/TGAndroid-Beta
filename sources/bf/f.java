package bf;

import ef.t;
public final class f extends gf.a {
    public final int f3917a;
    public final ef.a f3918b;

    public f(int i10) {
        this.f3917a = i10;
        switch (i10) {
            case 1:
                this.f3918b = new ef.p();
                return;
            default:
                this.f3918b = new ef.p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f3917a;
    }

    @Override
    public boolean b(ef.a aVar) {
        switch (this.f3917a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final ef.a e() {
        switch (this.f3917a) {
            case 0:
                return (ef.f) this.f3918b;
            default:
                return (t) this.f3918b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f3917a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final a h(g gVar) {
        switch (this.f3917a) {
            case 0:
                return a.a(gVar.f3922b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
