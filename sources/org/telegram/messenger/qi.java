package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f17422a;
    public final SendMessagesHelper f17423b;
    public final TLRPC.TL_error f17424c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17422a = i10;
        this.f17423b = sendMessagesHelper;
        this.f17424c = tL_error;
        this.d = m2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17422a) {
            case 0:
                this.f17423b.lambda$sendEditRichMessageRequest$25(this.f17424c, this.d, this.e);
                return;
            default:
                this.f17423b.lambda$editMessage$20(this.f17424c, this.d, this.e);
                return;
        }
    }
}
