package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17474a;
    public final SendMessagesHelper f17475b;
    public final TLRPC.TL_error f17476c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17474a = i10;
        this.f17475b = sendMessagesHelper;
        this.f17476c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17474a) {
            case 0:
                this.f17475b.lambda$sendEditRichMessageRequest$25(this.f17476c, this.d, this.e);
                return;
            default:
                this.f17475b.lambda$editMessage$20(this.f17476c, this.d, this.e);
                return;
        }
    }
}
