package af;

import df.t;
public final class g extends ff.a {
    public final int f563a;
    public final df.a f564b;

    public g(int i10) {
        this.f563a = i10;
        switch (i10) {
            case 1:
                this.f564b = new df.p();
                return;
            default:
                this.f564b = new df.p();
                return;
        }
    }

    @Override
    public void a(CharSequence charSequence) {
        int i10 = this.f563a;
    }

    @Override
    public boolean b(df.a aVar) {
        switch (this.f563a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override
    public final df.a e() {
        switch (this.f563a) {
            case 0:
                return (df.f) this.f564b;
            default:
                return (t) this.f564b;
        }
    }

    @Override
    public boolean f() {
        switch (this.f563a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final a h(h hVar) {
        switch (this.f563a) {
            case 0:
                return a.a(hVar.f568b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
