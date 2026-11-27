package defpackage;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class g10 implements Runnable {
    public final byte a;
    public final j20 b;
    public final TLRPC.TL_error c;

    public g10(j20 j20Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = j20Var;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        vnb vnbVar;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
            case 1:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
            case 2:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
            default:
                frameLayout = (FrameLayout) j20Var.b;
                vnbVar = j20Var.J0;
                break;
        }
        ik8.u(frameLayout, vnbVar, tL_error, false);
    }
}
