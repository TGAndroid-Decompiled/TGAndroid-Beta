package fe;

import ie.t;
public final class d extends ke.a {
    public final int f6058a;
    public final ie.a f6059b;

    public d(int i9) {
        this.f6058a = i9;
        switch (i9) {
            case 1:
                this.f6059b = new ie.p();
                return;
            default:
                this.f6059b = new ie.p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i9 = this.f6058a;
    }

    @Override
    public boolean b(ie.a aVar) {
        switch (this.f6058a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final ie.a e() {
        switch (this.f6058a) {
            case 0:
                return (ie.f) this.f6059b;
            default:
                return (t) this.f6059b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f6058a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final e4.h h(e eVar) {
        switch (this.f6058a) {
            case 0:
                return e4.h.a(eVar.f6063b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
