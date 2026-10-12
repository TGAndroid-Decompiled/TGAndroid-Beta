package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class hj implements Runnable {
    public final int f17435a;
    public final SendMessagesHelper f17436b;
    public final TLRPC.TL_error f17437c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage e;

    public hj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17435a = i10;
        this.f17436b = sendMessagesHelper;
        this.f17437c = tL_error;
        this.d = m2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17435a) {
            case 0:
                this.f17436b.lambda$sendEditRichMessageRequest$28(this.f17437c, this.d, this.e);
                return;
            default:
                this.f17436b.lambda$editMessage$23(this.f17437c, this.d, this.e);
                return;
        }
    }
}
