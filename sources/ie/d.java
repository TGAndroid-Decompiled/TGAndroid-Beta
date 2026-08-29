package ie;

import le.t;
public final class d extends ne.a {
    public final int f8895a;
    public final le.a f8896b;

    public d(int i10) {
        this.f8895a = i10;
        switch (i10) {
            case 1:
                this.f8896b = new le.p();
                return;
            default:
                this.f8896b = new le.p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f8895a;
    }

    @Override
    public boolean b(le.a aVar) {
        switch (this.f8895a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final le.a e() {
        switch (this.f8895a) {
            case 0:
                return (le.f) this.f8896b;
            default:
                return (t) this.f8896b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f8895a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final g4.h h(e eVar) {
        switch (this.f8895a) {
            case 0:
                return g4.h.a(eVar.f8900b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
