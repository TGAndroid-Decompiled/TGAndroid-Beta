package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uw implements Runnable {
    public final int f25895a;
    public final gz f25896b;
    public final TLRPC.TL_error f25897c;
    public final org.telegram.ui.ActionBar.f2 d;
    public final TLRPC.TL_messages_editMessage f25898e;

    public uw(gz gzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25895a = i7;
        this.f25896b = gzVar;
        this.f25897c = tL_error;
        this.d = f2Var;
        this.f25898e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25895a) {
            case 0:
                org.telegram.ui.Components.v4.c0(this.f25896b.currentAccount, this.f25897c, this.d, this.f25898e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.v4.c0(this.f25896b.currentAccount, this.f25897c, this.d, this.f25898e, new Object[0]);
                return;
        }
    }
}
