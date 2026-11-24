package defpackage;
public final class so3 extends x1 {
    public final byte a;
    public final gk0 b;

    public so3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new tg6();
                return;
            default:
                this.b = new tg6();
                return;
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        byte b = this.a;
    }

    @Override
    public final boolean b(gk0 gk0Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(gk0Var);
        }
    }

    @Override
    public final gk0 e() {
        byte b = this.a;
        gk0 gk0Var = this.b;
        switch (b) {
            case 0:
                return (ro3) gk0Var;
            default:
                return (jjb) gk0Var;
        }
    }

    @Override
    public final boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override
    public final vj2 h(vo3 vo3Var) {
        switch (this.a) {
            case 0:
                return vj2.a(vo3Var.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
