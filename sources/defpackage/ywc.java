package defpackage;
public final class ywc implements Runnable {
    public final byte a;
    public final xt b;

    public ywc(xt xtVar, byte b) {
        this.a = b;
        this.b = xtVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xt xtVar = this.b;
        switch (b) {
            case 0:
                boolean z = xtVar.a0;
                xs0 xs0Var = xtVar.c0;
                if (z) {
                    xs0Var.requestFocus();
                    hl.E3(xs0Var);
                    return;
                }
                xs0Var.clearFocus();
                hl.t1(xs0Var);
                return;
            default:
                xtVar.B0 = true;
                if (xtVar.getParent() != null) {
                    xtVar.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    xtVar.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
