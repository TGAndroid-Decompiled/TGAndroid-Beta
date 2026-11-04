package df;

import gf.t;
public final class f extends jf.a {
    public final int f8858a;
    public final gf.a f8859b;

    public f(int i3) {
        this.f8858a = i3;
        switch (i3) {
            case 1:
                this.f8859b = new gf.p();
                return;
            default:
                this.f8859b = new gf.p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i3 = this.f8858a;
    }

    @Override
    public boolean b(gf.a aVar) {
        switch (this.f8858a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final gf.a e() {
        switch (this.f8858a) {
            case 0:
                return (gf.f) this.f8859b;
            default:
                return (t) this.f8859b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f8858a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final a h(g gVar) {
        switch (this.f8858a) {
            case 0:
                return a.a(gVar.f8863b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
