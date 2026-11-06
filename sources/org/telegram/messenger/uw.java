package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uw implements Runnable {
    public final int f25903a;
    public final gz f25904b;
    public final TLRPC.TL_error f25905c;
    public final org.telegram.ui.ActionBar.f2 d;
    public final TLRPC.TL_messages_editMessage f25906e;

    public uw(gz gzVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f25903a = i7;
        this.f25904b = gzVar;
        this.f25905c = tL_error;
        this.d = f2Var;
        this.f25906e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f25903a) {
            case 0:
                org.telegram.ui.Components.v4.c0(this.f25904b.currentAccount, this.f25905c, this.d, this.f25906e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.v4.c0(this.f25904b.currentAccount, this.f25905c, this.d, this.f25906e, new Object[0]);
                return;
        }
    }
}
