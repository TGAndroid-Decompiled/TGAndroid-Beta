package defpackage;
public final class ksc implements Runnable {
    public final byte a;
    public final wt b;

    public ksc(wt wtVar, byte b) {
        this.a = b;
        this.b = wtVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wt wtVar = this.b;
        switch (b) {
            case 0:
                wtVar.B0 = true;
                if (wtVar.getParent() != null) {
                    wtVar.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    wtVar.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                boolean z = wtVar.a0;
                ps0 ps0Var = wtVar.c0;
                if (z) {
                    ps0Var.requestFocus();
                    gl.F3(ps0Var);
                    return;
                }
                ps0Var.clearFocus();
                gl.t1(ps0Var);
                return;
        }
    }
}
