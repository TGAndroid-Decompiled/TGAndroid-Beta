package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nw implements Runnable {
    public final int f26042a;
    public final az f26043b;
    public final TLRPC.TL_error f26044c;
    public final org.telegram.ui.ActionBar.g2 d;
    public final TLRPC.TL_messages_editMessage f26045e;

    public nw(az azVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f26042a = i7;
        this.f26043b = azVar;
        this.f26044c = tL_error;
        this.d = g2Var;
        this.f26045e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f26042a) {
            case 0:
                org.telegram.ui.Components.c5.c0(this.f26043b.currentAccount, this.f26044c, this.d, this.f26045e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.c5.c0(this.f26043b.currentAccount, this.f26044c, this.d, this.f26045e, new Object[0]);
                return;
        }
    }
}
