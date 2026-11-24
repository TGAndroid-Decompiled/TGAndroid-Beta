package defpackage;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class f10 implements Runnable {
    public final byte a;
    public final i20 b;
    public final TLRPC.TL_error c;

    public f10(i20 i20Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = i20Var;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        wjb wjbVar;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
            case 1:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
            case 2:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
            default:
                frameLayout = (FrameLayout) i20Var.b;
                wjbVar = i20Var.J0;
                break;
        }
        ug8.u(frameLayout, wjbVar, tL_error, false);
    }
}
