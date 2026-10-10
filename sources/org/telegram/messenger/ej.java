package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f17779a;
    public final SendMessagesHelper f17780b;
    public final TLRPC.TL_error f17781c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f17782e;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17779a = i10;
        this.f17780b = sendMessagesHelper;
        this.f17781c = tL_error;
        this.d = n2Var;
        this.f17782e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17779a) {
            case 0:
                this.f17780b.lambda$sendEditRichMessageRequest$28(this.f17781c, this.d, this.f17782e);
                return;
            default:
                this.f17780b.lambda$editMessage$23(this.f17781c, this.d, this.f17782e);
                return;
        }
    }
}
