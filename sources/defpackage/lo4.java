package defpackage;

import android.os.Bundle;
public final class lo4 implements Runnable {
    public final byte a;
    public final sxb b;

    public lo4(sxb sxbVar, byte b) {
        this.a = b;
        this.b = sxbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sxb sxbVar = this.b;
        switch (b) {
            case 0:
                if (sxbVar.getParentLayout() != null) {
                    sxbVar.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", sxbVar.a);
                    yv1 yv1Var = new yv1(bundle);
                    yv1Var.Ga = true;
                    sxbVar.presentFragment(yv1Var);
                    return;
                }
                return;
            case 1:
                sxbVar.y0();
                sxbVar.C0();
                return;
            case 2:
                sxbVar.y0();
                return;
            case 3:
                sxbVar.S0(true);
                return;
            case 4:
                sxbVar.finishPreviewFragment();
                return;
            case 5:
                sxbVar.B0 = null;
                sxbVar.Z0(true, false);
                return;
            default:
                sxbVar.O.postOnAnimation(new lo4(sxbVar, (byte) 2));
                return;
        }
    }
}
