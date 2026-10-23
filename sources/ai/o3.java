package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u91;
public final class o3 implements Runnable {
    public final int f1930a = 0;
    public final TLRPC.Chat f1931b;

    public o3(l7 l7Var, TLRPC.Chat chat) {
        this.f1931b = chat;
    }

    @Override
    public final void run() {
        switch (this.f1930a) {
            case 0:
                l7.D2(u91.d0(this.f1931b, true));
                return;
            default:
                TLRPC.Chat chat = this.f1931b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21636a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.y5(-chat.f20343id), obj);
                    return;
                }
                return;
        }
    }

    public o3(TLRPC.Chat chat) {
        this.f1931b = chat;
    }
}
