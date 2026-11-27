package defpackage;

import android.view.View;
public final class voc implements Runnable {
    public final byte a;
    public final zoc b;

    public voc(zoc zocVar, byte b) {
        this.a = b;
        this.b = zocVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zoc zocVar = this.b;
        switch (b) {
            case 0:
                dl1 dl1Var = zocVar.a;
                if (dl1Var.getParent() instanceof View) {
                    ((View) dl1Var.getParent()).invalidate();
                    return;
                }
                return;
            default:
                zocVar.p();
                return;
        }
    }
}
