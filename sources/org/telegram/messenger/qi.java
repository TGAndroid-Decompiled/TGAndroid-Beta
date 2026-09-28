package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f17405a;
    public final SendMessagesHelper f17406b;
    public final TLRPC.TL_error f17407c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17405a = i10;
        this.f17406b = sendMessagesHelper;
        this.f17407c = tL_error;
        this.d = m2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17405a) {
            case 0:
                this.f17406b.lambda$sendEditRichMessageRequest$25(this.f17407c, this.d, this.e);
                return;
            default:
                this.f17406b.lambda$editMessage$20(this.f17407c, this.d, this.e);
                return;
        }
    }
}
