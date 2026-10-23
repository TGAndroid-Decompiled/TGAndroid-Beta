package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bj implements Runnable {
    public final int f17980a;
    public final SendMessagesHelper f17981b;
    public final TLRPC.TL_error f17982c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public bj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17980a = i10;
        this.f17981b = sendMessagesHelper;
        this.f17982c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17980a) {
            case 0:
                this.f17981b.lambda$sendEditRichMessageRequest$28(this.f17982c, this.d, this.e);
                return;
            default:
                this.f17981b.lambda$editMessage$23(this.f17982c, this.d, this.e);
                return;
        }
    }
}
