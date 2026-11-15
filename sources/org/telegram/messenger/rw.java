package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class rw implements Runnable {
    public final int f26369a;
    public final ez f26370b;
    public final TLRPC.TL_error f26371c;
    public final org.telegram.ui.ActionBar.e2 d;
    public final TLRPC.TL_messages_editMessage f26372e;

    public rw(ez ezVar, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i7) {
        this.f26369a = i7;
        this.f26370b = ezVar;
        this.f26371c = tL_error;
        this.d = e2Var;
        this.f26372e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f26369a) {
            case 0:
                org.telegram.ui.Components.t4.c0(this.f26370b.currentAccount, this.f26371c, this.d, this.f26372e, new Object[0]);
                return;
            default:
                org.telegram.ui.Components.t4.c0(this.f26370b.currentAccount, this.f26371c, this.d, this.f26372e, new Object[0]);
                return;
        }
    }
}
