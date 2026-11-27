package defpackage;

import java.util.List;
public final class zl0 implements e84 {
    public final byte a;
    public final lma b;

    public zl0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new lma(35152, 2, "image/png");
                return;
            default:
                this.b = new lma(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final e84 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
            case 0:
                return lmaVar.b(f84Var, v11Var);
            default:
                return lmaVar.b(f84Var, v11Var);
        }
    }

    @Override
    public final boolean c(f84 f84Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
            case 0:
                return lmaVar.c(f84Var);
            default:
                return lmaVar.c(f84Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
            case 0:
                lmaVar.d(j, j2);
                return;
            default:
                lmaVar.d(j, j2);
                return;
        }
    }

    @Override
    public final List e() {
        byte b = this.a;
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        byte b = this.a;
        lma lmaVar = this.b;
        switch (b) {
            case 0:
                lmaVar.f(g84Var);
                return;
            default:
                lmaVar.f(g84Var);
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
