package defpackage;

import android.view.View;
public final class jkc implements Runnable {
    public final byte a;
    public final nkc b;

    public jkc(nkc nkcVar, byte b) {
        this.a = b;
        this.b = nkcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nkc nkcVar = this.b;
        switch (b) {
            case 0:
                uk1 uk1Var = nkcVar.a;
                if (uk1Var.getParent() instanceof View) {
                    ((View) uk1Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                nkcVar.p();
                return;
        }
    }
}
