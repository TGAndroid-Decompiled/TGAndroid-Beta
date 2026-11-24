package defpackage;

import org.telegram.ui.ActionBar.d;
public final class xf0 implements i11 {
    public final byte a;
    public final d b;

    public xf0(d dVar, byte b) {
        this.a = b;
        this.b = dVar;
    }

    @Override
    public final boolean a() {
        byte b = this.a;
        return true;
    }

    @Override
    public final void b(float f) {
        byte b = this.a;
    }

    @Override
    public final void c(m21 m21Var) {
        byte b = this.a;
    }

    @Override
    public final boolean d() {
        byte b = this.a;
        return true;
    }

    @Override
    public final int e(int i) {
        byte b = this.a;
        d dVar = this.b;
        switch (b) {
            case 0:
                if (dVar.isSupportEdgeToEdge()) {
                    return gl.n;
                }
                return 0;
            default:
                return dVar.getBottomInset();
        }
    }

    @Override
    public final boolean f(int i) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void g(m21 m21Var) {
        byte b = this.a;
    }

    @Override
    public final int h(int i) {
        byte b = this.a;
        return 0;
    }

    private final void i(float f) {
    }

    private final void j(float f) {
    }

    private final void k(m21 m21Var) {
    }

    private final void l(m21 m21Var) {
    }

    private final void m(m21 m21Var) {
    }

    private final void n(m21 m21Var) {
    }
}
