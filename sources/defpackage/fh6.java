package defpackage;
public final class fh6 implements Runnable {
    public final byte a;
    public final ph6 b;

    public fh6(ph6 ph6Var, byte b) {
        this.a = b;
        this.b = ph6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ph6 ph6Var = this.b;
        switch (b) {
            case 0:
                mh6 mh6Var = ph6Var.a;
                qh6 qh6Var = ph6Var.h0;
                mh6 mh6Var2 = ph6Var.b;
                if (mh6Var2 != null) {
                    if (qh6Var.d0) {
                        mh6Var.clearFocus();
                        mh6Var2.clearFocus();
                    } else if (mh6Var.length() != 0) {
                        mh6Var2.requestFocus();
                        if (!ph6Var.U) {
                            mh6Var2.setSelection(mh6Var2.length());
                        }
                        qh6Var.M1(mh6Var2);
                    } else {
                        mh6Var.requestFocus();
                        qh6Var.M1(mh6Var);
                    }
                }
                if (qh6Var.G == 0) {
                    ph6Var.s();
                    return;
                }
                return;
            case 1:
                ph6Var.postDelayed(new fh6(ph6Var, (byte) 2), 200L);
                return;
            case 2:
                ph6Var.h(null);
                return;
            case 3:
                ph6Var.t(true);
                return;
            default:
                ph6Var.h0.M1(ph6Var.b);
                return;
        }
    }
}
