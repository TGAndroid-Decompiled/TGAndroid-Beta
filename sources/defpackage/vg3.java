package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class vg3 implements Runnable {
    public final byte a;
    public final uj3 b;
    public final TLRPC.TL_attachMenuBot c;
    public final LaunchActivity d;

    public vg3(uj3 uj3Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = uj3Var;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        LaunchActivity launchActivity = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.d4(tL_attachMenuBot, launchActivity);
                return;
            default:
                uj3Var.b4(tL_attachMenuBot, launchActivity);
                return;
        }
    }
}
