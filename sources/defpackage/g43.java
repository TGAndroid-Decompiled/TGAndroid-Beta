package defpackage;
public final class g43 implements Runnable {
    public final byte a;
    public final m43 b;

    public g43(m43 m43Var, byte b) {
        this.a = b;
        this.b = m43Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        m43 m43Var = this.b;
        switch (b) {
            case 0:
                m43Var.a.invalidate();
                return;
            default:
                st stVar = m43Var.c;
                if (stVar.getParent() != null) {
                    if (m43Var.d) {
                        gl.B2(stVar);
                    } else {
                        try {
                            m43Var.b.removeView(stVar);
                        } catch (Exception unused) {
                        }
                    }
                    sr8 sr8Var = m43Var.p;
                    if (sr8Var != null) {
                        sr8Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
