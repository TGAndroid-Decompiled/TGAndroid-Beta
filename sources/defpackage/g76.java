package defpackage;
public final class g76 extends x1 {
    public final f76 a = new ui6();
    public final int b;
    public boolean c;

    public g76(int i) {
        this.b = i;
    }

    @Override
    public final boolean b(gl0 gl0Var) {
        if (this.c) {
            gl0 gl0Var2 = (gl0) ((ui6) this.a.b);
            return true;
        }
        return true;
    }

    @Override
    public final gl0 e() {
        return this.a;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final il2 h(fq3 fq3Var) {
        boolean z = false;
        if (fq3Var.h) {
            if (((ui6) this.a.c) != null) {
                gl0 e = fq3Var.h().e();
                this.c = ((e instanceof uw7) || (e instanceof f76)) ? true : true;
                return il2.a(fq3Var.e);
            }
            return null;
        }
        int i = fq3Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new il2(-1, fq3Var.c + i2, false);
        }
        return null;
    }
}
