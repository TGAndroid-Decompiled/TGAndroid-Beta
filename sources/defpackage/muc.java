package defpackage;
public final class muc implements Runnable {
    public final byte a;
    public final wu b;

    public muc(wu wuVar, byte b) {
        this.a = b;
        this.b = wuVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wu wuVar = this.b;
        switch (b) {
            case 0:
                wuVar.B0 = true;
                if (wuVar.getParent() != null) {
                    wuVar.getParent().requestDisallowInterceptTouchEvent(true);
                }
                try {
                    wuVar.performHapticFeedback(0, 1);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                boolean z = wuVar.a0;
                vc vcVar = wuVar.c0;
                if (z) {
                    vcVar.requestFocus();
                    gm.E3(vcVar);
                    return;
                }
                vcVar.clearFocus();
                gm.t1(vcVar);
                return;
        }
    }
}
