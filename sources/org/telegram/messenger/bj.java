package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f18044a;
    public final SendMessagesHelper f18045b;
    public final TLRPC.TL_error f18046c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.TL_messages_editMessage e;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18044a = i10;
        this.f18045b = sendMessagesHelper;
        this.f18046c = tL_error;
        this.d = o2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18044a) {
            case 0:
                this.f18045b.lambda$sendEditRichMessageRequest$28(this.f18046c, this.d, this.e);
                return;
            default:
                this.f18045b.lambda$editMessage$23(this.f18046c, this.d, this.e);
                return;
        }
    }
}
