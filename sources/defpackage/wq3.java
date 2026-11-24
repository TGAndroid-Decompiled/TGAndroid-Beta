package defpackage;

import android.view.ViewGroup;
public final class wq3 implements Runnable {
    public final byte a;
    public final xq3 b;

    public wq3(xq3 xq3Var, byte b) {
        this.a = b;
        this.b = xq3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xq3 xq3Var = this.b;
        switch (b) {
            case 0:
                if (xq3Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) xq3Var.getParent()).removeView(xq3Var);
                    return;
                }
                return;
            default:
                xq3Var.a();
                return;
        }
    }
}
