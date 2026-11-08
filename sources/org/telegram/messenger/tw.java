package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class tw implements Runnable {
    public final int f25686a;
    public final gz f25687b;
    public final TLRPC.TL_error f25688c;
    public final org.telegram.ui.ActionBar.f2 d;
    public final TLRPC.TL_messages_editMessage f25689e;

    public tw(gz gzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25686a = i7;
        this.f25687b = gzVar;
        this.f25688c = tL_error;
        this.d = f2Var;
        this.f25689e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25686a) {
            case 0:
                org.telegram.ui.Components.v4.c0(this.f25687b.currentAccount, this.f25688c, this.d, this.f25689e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.v4.c0(this.f25687b.currentAccount, this.f25688c, this.d, this.f25689e, new Object[0]);
                return;
        }
    }
}
