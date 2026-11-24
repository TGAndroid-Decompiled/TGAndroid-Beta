package defpackage;

import java.util.List;
public final class ym0 implements s84 {
    public final byte a;
    public final ska b;

    public ym0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ska(35152, 2, "image/png");
                return;
            default:
                this.b = new ska(16973, 2, "image/bmp");
                return;
        }
    }

    @Override
    public final s84 a() {
        byte b = this.a;
        return this;
    }

    @Override
    public final int b(t84 t84Var, u21 u21Var) {
        byte b = this.a;
        ska skaVar = this.b;
        switch (b) {
            case 0:
                return skaVar.b(t84Var, u21Var);
            default:
                return skaVar.b(t84Var, u21Var);
        }
    }

    @Override
    public final boolean c(t84 t84Var) {
        byte b = this.a;
        ska skaVar = this.b;
        switch (b) {
            case 0:
                return skaVar.c(t84Var);
            default:
                return skaVar.c(t84Var);
        }
    }

    @Override
    public final void d(long j, long j2) {
        byte b = this.a;
        ska skaVar = this.b;
        switch (b) {
            case 0:
                skaVar.d(j, j2);
                return;
            default:
                skaVar.d(j, j2);
                return;
        }
    }

    @Override
    public final List e() {
        byte b = this.a;
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        byte b = this.a;
        ska skaVar = this.b;
        switch (b) {
            case 0:
                skaVar.f(u84Var);
                return;
            default:
                skaVar.f(u84Var);
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
