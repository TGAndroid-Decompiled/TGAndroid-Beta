package defpackage;
public final class bf6 implements Runnable {
    public final byte a;
    public final lf6 b;

    public bf6(lf6 lf6Var, byte b) {
        this.a = b;
        this.b = lf6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        lf6 lf6Var = this.b;
        switch (b) {
            case 0:
                if6 if6Var = lf6Var.a;
                mf6 mf6Var = lf6Var.h0;
                if6 if6Var2 = lf6Var.b;
                if (if6Var2 != null) {
                    if (mf6Var.d0) {
                        if6Var.clearFocus();
                        if6Var2.clearFocus();
                    } else if (if6Var.length() != 0) {
                        if6Var2.requestFocus();
                        if (!lf6Var.U) {
                            if6Var2.setSelection(if6Var2.length());
                        }
                        mf6Var.L1(if6Var2);
                    } else {
                        if6Var.requestFocus();
                        mf6Var.L1(if6Var);
                    }
                }
                if (mf6Var.G == 0) {
                    lf6Var.s();
                    return;
                }
                return;
            case 1:
                lf6Var.postDelayed(new bf6(lf6Var, (byte) 2), 200L);
                return;
            case 2:
                lf6Var.h(null);
                return;
            case 3:
                lf6Var.t(true);
                return;
            default:
                lf6Var.h0.L1(lf6Var.b);
                return;
        }
    }
}
