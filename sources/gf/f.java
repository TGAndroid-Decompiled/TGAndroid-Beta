package gf;

import kf.t;
public final class f extends mf.a {
    public final int f13230a;
    public final kf.a f13231b;

    public f(int i7) {
        this.f13230a = i7;
        switch (i7) {
            case 1:
                this.f13231b = new kf.p();
                return;
            default:
                this.f13231b = new kf.p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i7 = this.f13230a;
    }

    @Override
    public boolean b(kf.a aVar) {
        switch (this.f13230a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final kf.a e() {
        switch (this.f13230a) {
            case 0:
                return (kf.f) this.f13231b;
            default:
                return (t) this.f13231b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f13230a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final a h(g gVar) {
        switch (this.f13230a) {
            case 0:
                return a.a(gVar.f13235b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
