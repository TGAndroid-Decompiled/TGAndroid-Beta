package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f17407a;
    public final SendMessagesHelper f17408b;
    public final TLRPC.TL_error f17409c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17407a = i10;
        this.f17408b = sendMessagesHelper;
        this.f17409c = tL_error;
        this.d = m2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17407a) {
            case 0:
                this.f17408b.lambda$sendEditRichMessageRequest$25(this.f17409c, this.d, this.e);
                return;
            default:
                this.f17408b.lambda$editMessage$20(this.f17409c, this.d, this.e);
                return;
        }
    }
}
