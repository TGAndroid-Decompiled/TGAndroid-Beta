package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tw implements Runnable {
    public final int f25690a;
    public final gz f25691b;
    public final TLRPC.TL_error f25692c;
    public final org.telegram.ui.ActionBar.f2 d;
    public final TLRPC.TL_messages_editMessage f25693e;

    public tw(gz gzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25690a = i7;
        this.f25691b = gzVar;
        this.f25692c = tL_error;
        this.d = f2Var;
        this.f25693e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25690a) {
            case 0:
                org.telegram.ui.Components.u4.c0(this.f25691b.currentAccount, this.f25692c, this.d, this.f25693e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.u4.c0(this.f25691b.currentAccount, this.f25692c, this.d, this.f25693e, new Object[0]);
                return;
        }
    }
}
