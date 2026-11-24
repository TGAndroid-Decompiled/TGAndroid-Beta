package defpackage;

import java.util.List;
public final class yl0 implements j74 {
    public final byte a;
    public final qia b;

    public yl0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new qia(35152, 2, "image/png");
                return;
            default:
                this.b = new qia(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final j74 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
            case 0:
                return qiaVar.b(k74Var, m11Var);
            default:
                return qiaVar.b(k74Var, m11Var);
        }
    }

    @Override
    public final boolean c(k74 k74Var) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
            case 0:
                return qiaVar.c(k74Var);
            default:
                return qiaVar.c(k74Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
            case 0:
                qiaVar.d(j, j2);
                return;
            default:
                qiaVar.d(j, j2);
                return;
        }
    }

    @Override
    public final List e() {
        byte b = this.a;
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        byte b = this.a;
        qia qiaVar = this.b;
        switch (b) {
            case 0:
                qiaVar.f(l74Var);
                return;
            default:
                qiaVar.f(l74Var);
                return;
        }
    }

    @Override
    public final void release() {
        byte b = this.a;
    }

    private final void g() {
    }

    private final void h() {
    }
}
