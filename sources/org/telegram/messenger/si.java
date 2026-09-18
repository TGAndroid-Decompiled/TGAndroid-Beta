package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class si implements Runnable {
    public final int f17509a;
    public final SendMessagesHelper f17510b;
    public final TLRPC.TL_error f17511c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public si(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17509a = i10;
        this.f17510b = sendMessagesHelper;
        this.f17511c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17509a) {
            case 0:
                this.f17510b.lambda$sendEditRichMessageRequest$25(this.f17511c, this.d, this.e);
                return;
            default:
                this.f17510b.lambda$editMessage$20(this.f17511c, this.d, this.e);
                return;
        }
    }
}
