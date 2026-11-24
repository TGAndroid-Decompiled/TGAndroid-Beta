package defpackage;

import org.telegram.messenger.a;
public final class aa6 implements Runnable {
    public final byte a;
    public final qa6 b;
    public final vh5 c;

    public aa6(qa6 qa6Var, vh5 vh5Var, byte b) {
        this.a = b;
        this.b = qa6Var;
        this.c = vh5Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                qa6 qa6Var = this.b;
                vh5 vh5Var = this.c;
                if (qa6Var.H != null && qa6Var.getParentActivity() != null) {
                    try {
                        ((gl2) vh5Var).G();
                        ((ize) a.j()).initializeMaps(a.b);
                        ((gl2) qa6Var.H).s(new gw(qa6Var, (byte) 9));
                        qa6Var.x0 = true;
                        if (qa6Var.y0) {
                            ((gl2) qa6Var.H).J();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                qa6 qa6Var2 = this.b;
                vh5 vh5Var2 = this.c;
                try {
                    ((gl2) vh5Var2).G();
                } catch (Exception unused) {
                }
                gl.c3(new aa6(qa6Var2, vh5Var2, (byte) 0));
                return;
        }
    }
}
