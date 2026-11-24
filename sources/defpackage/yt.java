package defpackage;

import org.telegram.ui.o;
public final class yt extends ive {
    public final byte a;
    public final o b;

    public yt(o oVar, byte b) {
        this.a = b;
        this.b = oVar;
    }

    @Override
    public final void a(boolean z) {
        byte b = this.a;
        o oVar = this.b;
        switch (b) {
            case 0:
                if (z) {
                    oVar.i0.h(false);
                    return;
                }
                return;
            default:
                fx0 fx0Var = oVar.J;
                if (fx0Var != null) {
                    fx0Var.E0 = z;
                    return;
                }
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.a) {
            case 0:
                if (gl.C3()) {
                    new u21(this.b.h0, null).i(k96.M0(2131743953, null)).j();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
