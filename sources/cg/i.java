package cg;

import hh.i5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.q91;
import org.telegram.ui.v5;

public final class i implements Runnable {

    public final int f2703a = 1;

    public final TLRPC.Chat f2704b;

    public i(i5 i5Var, TLRPC.Chat chat) {
        this.f2704b = chat;
    }

    @Override
    public final void run() {
        switch (this.f2703a) {
            case 0:
                TLRPC.Chat chat = this.f2704b;
                if (chat != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f22380id), l2Var);
                }
                break;
            default:
                i5.d2(q91.d0(this.f2704b, true));
                break;
        }
    }

    public i(TLRPC.Chat chat) {
        this.f2704b = chat;
    }
}
