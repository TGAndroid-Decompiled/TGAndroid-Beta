package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class nw implements Runnable {
    public final int f26006a;
    public final az f26007b;
    public final TLRPC.TL_error f26008c;
    public final org.telegram.ui.ActionBar.g2 d;
    public final TLRPC.TL_messages_editMessage f26009e;

    public nw(az azVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f26006a = i7;
        this.f26007b = azVar;
        this.f26008c = tL_error;
        this.d = g2Var;
        this.f26009e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f26006a) {
            case 0:
                org.telegram.ui.Components.c5.c0(this.f26007b.currentAccount, this.f26008c, this.d, this.f26009e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.c5.c0(this.f26007b.currentAccount, this.f26008c, this.d, this.f26009e, new Object[0]);
                return;
        }
    }
}
