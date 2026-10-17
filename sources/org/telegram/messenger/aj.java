package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17877a;
    public final SendMessagesHelper f17878b;
    public final TLRPC.TL_error f17879c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17877a = i10;
        this.f17878b = sendMessagesHelper;
        this.f17879c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17877a) {
            case 0:
                this.f17878b.lambda$sendEditRichMessageRequest$28(this.f17879c, this.d, this.e);
                return;
            default:
                this.f17878b.lambda$editMessage$23(this.f17879c, this.d, this.e);
                return;
        }
    }
}
