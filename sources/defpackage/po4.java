package defpackage;

import android.os.Bundle;
public final class po4 implements Runnable {
    public final byte a;
    public final tzb b;

    public po4(tzb tzbVar, byte b) {
        this.a = b;
        this.b = tzbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tzb tzbVar = this.b;
        switch (b) {
            case 0:
                if (tzbVar.getParentLayout() != null) {
                    tzbVar.I = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tzbVar.a);
                    zu1 zu1Var = new zu1(bundle);
                    zu1Var.Ga = true;
                    tzbVar.presentFragment(zu1Var);
                    return;
                }
                return;
            case 1:
                tzbVar.y0();
                tzbVar.C0();
                return;
            case 2:
                tzbVar.y0();
                return;
            case 3:
                tzbVar.S0(true);
                return;
            case 4:
                tzbVar.B0 = null;
                tzbVar.Z0(true, false);
                return;
            case 5:
                tzbVar.finishPreviewFragment();
                return;
            default:
                tzbVar.O.postOnAnimation(new po4(tzbVar, (byte) 2));
                return;
        }
    }
}
