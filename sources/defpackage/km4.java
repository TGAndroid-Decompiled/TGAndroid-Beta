package defpackage;

import android.os.Bundle;
public final class km4 implements Runnable {
    public final byte a;
    public final qvb b;

    public km4(qvb qvbVar, byte b) {
        this.a = b;
        this.b = qvbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qvb qvbVar = this.b;
        switch (b) {
            case 0:
                if (qvbVar.getParentLayout() != null) {
                    qvbVar.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", qvbVar.a);
                    mu1 mu1Var = new mu1(bundle);
                    mu1Var.Ga = true;
                    qvbVar.presentFragment(mu1Var);
                    return;
                }
                return;
            case 1:
                qvbVar.x0();
                qvbVar.B0();
                return;
            case 2:
                qvbVar.x0();
                return;
            case 3:
                qvbVar.R0(true);
                return;
            case 4:
                qvbVar.finishPreviewFragment();
                return;
            case 5:
                qvbVar.B0 = null;
                qvbVar.Y0(true, false);
                return;
            default:
                qvbVar.O.postOnAnimation(new km4(qvbVar, (byte) 2));
                return;
        }
    }
}
