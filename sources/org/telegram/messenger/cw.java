package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cw implements Runnable {
    public final int f22088a;
    public final yy f22089b;
    public final TLRPC.Updates f22090c;

    public cw(yy yyVar, TLRPC.Updates updates, int i3) {
        this.f22088a = i3;
        this.f22089b = yyVar;
        this.f22090c = updates;
    }

    @Override
    public final void run() {
        switch (this.f22088a) {
            case 0:
                this.f22089b.getMessagesController().O3(this.f22090c, false);
                return;
            default:
                this.f22089b.getMessagesController().O3(this.f22090c, false);
                return;
        }
    }
}
