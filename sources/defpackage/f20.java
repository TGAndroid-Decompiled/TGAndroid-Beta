package defpackage;

import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class f20 implements Runnable {
    public final byte a;
    public final i30 b;
    public final TLRPC.TL_error c;

    public f20(i30 i30Var, TLRPC.TL_error tL_error, byte b) {
        this.a = b;
        this.b = i30Var;
        this.c = tL_error;
    }

    @Override
    public final void run() {
        FrameLayout frameLayout;
        ylb ylbVar;
        byte b = this.a;
        TLRPC.TL_error tL_error = this.c;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
            case 1:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
            case 2:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
            default:
                frameLayout = (FrameLayout) i30Var.b;
                ylbVar = i30Var.J0;
                break;
        }
        wi8.u(frameLayout, ylbVar, tL_error, false);
    }
}
