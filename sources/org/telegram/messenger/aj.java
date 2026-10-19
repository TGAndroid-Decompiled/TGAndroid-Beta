package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class aj implements Runnable {
    public final int f17889a;
    public final SendMessagesHelper f17890b;
    public final TLRPC.TL_error f17891c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public aj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17889a = i10;
        this.f17890b = sendMessagesHelper;
        this.f17891c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17889a) {
            case 0:
                this.f17890b.lambda$sendEditRichMessageRequest$28(this.f17891c, this.d, this.e);
                return;
            default:
                this.f17890b.lambda$editMessage$23(this.f17891c, this.d, this.e);
                return;
        }
    }
}
