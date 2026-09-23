package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f17154a;
    public final SendMessagesHelper f17155b;
    public final TLRPC.TL_error f17156c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17154a = i10;
        this.f17155b = sendMessagesHelper;
        this.f17156c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17154a) {
            case 0:
                this.f17155b.lambda$sendEditRichMessageRequest$25(this.f17156c, this.d, this.e);
                return;
            default:
                this.f17155b.lambda$editMessage$20(this.f17156c, this.d, this.e);
                return;
        }
    }
}
