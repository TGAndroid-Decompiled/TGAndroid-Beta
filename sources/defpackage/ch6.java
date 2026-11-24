package defpackage;
public final class ch6 implements Runnable {
    public final byte a;
    public final lh6 b;

    public ch6(lh6 lh6Var, byte b) {
        this.a = b;
        this.b = lh6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lh6 lh6Var = this.b;
        switch (b) {
            case 0:
                jh6 jh6Var = lh6Var.a;
                mh6 mh6Var = lh6Var.h0;
                jh6 jh6Var2 = lh6Var.b;
                if (jh6Var2 != null) {
                    if (mh6Var.d0) {
                        jh6Var.clearFocus();
                        jh6Var2.clearFocus();
                    } else if (jh6Var.length() != 0) {
                        jh6Var2.requestFocus();
                        if (!lh6Var.U) {
                            jh6Var2.setSelection(jh6Var2.length());
                        }
                        mh6Var.M1(jh6Var2);
                    } else {
                        jh6Var.requestFocus();
                        mh6Var.M1(jh6Var);
                    }
                }
                if (mh6Var.G == 0) {
                    lh6Var.s();
                    return;
                }
                return;
            case 1:
                lh6Var.postDelayed(new ch6(lh6Var, (byte) 2), 200L);
                return;
            case 2:
                lh6Var.h(null);
                return;
            case 3:
                lh6Var.t(true);
                return;
            default:
                lh6Var.h0.M1(lh6Var.b);
                return;
        }
    }
}
