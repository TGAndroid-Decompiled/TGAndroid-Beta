package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f17132a;
    public final SendMessagesHelper f17133b;
    public final TLRPC.TL_error f17134c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage e;

    public hj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17132a = i10;
        this.f17133b = sendMessagesHelper;
        this.f17134c = tL_error;
        this.d = m2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17132a) {
            case 0:
                this.f17133b.lambda$sendEditRichMessageRequest$28(this.f17134c, this.d, this.e);
                return;
            default:
                this.f17133b.lambda$editMessage$23(this.f17134c, this.d, this.e);
                return;
        }
    }
}
