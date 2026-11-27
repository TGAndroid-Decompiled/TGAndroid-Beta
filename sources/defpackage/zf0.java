package defpackage;

import org.telegram.ui.ActionBar.e;
public final class zf0 implements r11 {
    public final byte a;
    public final e b;

    public zf0(e eVar, byte b) {
        this.a = b;
        this.b = eVar;
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
    public final void c(v21 v21Var) {
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
        e eVar = this.b;
        switch (b) {
            case 0:
                if (eVar.isSupportEdgeToEdge()) {
                    return hl.n;
                }
                return 0;
            default:
                return eVar.getBottomInset();
        }
    }

    @Override
    public final boolean f(int i) {
        byte b = this.a;
        return false;
    }

    @Override
    public final void g(v21 v21Var) {
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

    private final void k(v21 v21Var) {
    }

    private final void l(v21 v21Var) {
    }

    private final void m(v21 v21Var) {
    }

    private final void n(v21 v21Var) {
    }
}
