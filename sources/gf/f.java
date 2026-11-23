package gf;

import kf.t;
public final class f extends mf.a {
    public final int f13537a;
    public final kf.a f13538b;

    public f(int i7) {
        this.f13537a = i7;
        switch (i7) {
            case 1:
                this.f13538b = new kf.p();
                return;
            default:
                this.f13538b = new kf.p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i7 = this.f13537a;
    }

    @Override
    public boolean b(kf.a aVar) {
        switch (this.f13537a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final kf.a e() {
        switch (this.f13537a) {
            case 0:
                return (kf.f) this.f13538b;
            default:
                return (t) this.f13538b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f13537a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final a h(g gVar) {
        switch (this.f13537a) {
            case 0:
                return a.a(gVar.f13542b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
