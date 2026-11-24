package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class og3 implements Runnable {
    public final byte a;
    public final cj3 b;
    public final TLRPC.TL_attachMenuBot c;
    public final LaunchActivity d;

    public og3(cj3 cj3Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity, byte b) {
        this.a = b;
        this.b = cj3Var;
        this.c = tL_attachMenuBot;
        this.d = launchActivity;
    }

    @Override
    public final void run() {
        byte b = this.a;
        LaunchActivity launchActivity = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.Y3(tL_attachMenuBot, launchActivity);
                return;
            default:
                cj3Var.a4(tL_attachMenuBot, launchActivity);
                return;
        }
    }
}
