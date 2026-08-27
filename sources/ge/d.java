package ge;

import je.t;

public final class d extends le.a {

    public final int f6858a;

    public final je.a f6859b;

    public d(int i10) {
        this.f6858a = i10;
        switch (i10) {
            case 1:
                this.f6859b = new t();
                break;
            default:
                this.f6859b = new je.f();
                break;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f6858a;
    }

    @Override
    public boolean b(je.a aVar) {
        switch (this.f6858a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final je.a e() {
        switch (this.f6858a) {
            case 0:
                return (je.f) this.f6859b;
            default:
                return (t) this.f6859b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f6858a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final e4.h h(e eVar) {
        switch (this.f6858a) {
            case 0:
                return e4.h.a(eVar.f6863b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
