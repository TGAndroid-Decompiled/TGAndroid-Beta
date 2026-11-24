package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class jh3 implements Runnable {
    public final byte a;
    public final nk3 b;
    public final TLRPC.TL_attachMenuBot c;
    public final LaunchActivity d;

    public jh3(nk3 nk3Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = nk3Var;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        LaunchActivity launchActivity = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.d4(tL_attachMenuBot, launchActivity);
                return;
            default:
                nk3Var.b4(tL_attachMenuBot, launchActivity);
                return;
        }
    }
}
