package defpackage;
public final class jp3 extends y1 {
    public final byte a;
    public final hk0 b;

    public jp3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yi6();
                return;
            default:
                this.b = new yi6();
                return;
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        byte b = this.a;
    }

    @Override
    public final boolean b(hk0 hk0Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(hk0Var);
        }
    }

    @Override
    public final hk0 e() {
        byte b = this.a;
        hk0 hk0Var = this.b;
        switch (b) {
            case 0:
                return (ip3) hk0Var;
            default:
                return (inb) hk0Var;
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
    public final qk2 h(mp3 mp3Var) {
        switch (this.a) {
            case 0:
                return qk2.a(mp3Var.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
