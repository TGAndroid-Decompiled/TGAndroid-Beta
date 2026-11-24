package defpackage;
public final class cq3 extends x1 {
    public final byte a;
    public final gl0 b;

    public cq3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ui6();
                return;
            default:
                this.b = new ui6();
                return;
        }
    }

    @Override
    public final void a(CharSequence charSequence) {
        byte b = this.a;
    }

    @Override
    public final boolean b(gl0 gl0Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(gl0Var);
        }
    }

    @Override
    public final gl0 e() {
        byte b = this.a;
        gl0 gl0Var = this.b;
        switch (b) {
            case 0:
                return (bq3) gl0Var;
            default:
                return (klb) gl0Var;
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
    public final il2 h(fq3 fq3Var) {
        switch (this.a) {
            case 0:
                return il2.a(fq3Var.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
