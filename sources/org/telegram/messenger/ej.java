package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f17775a;
    public final SendMessagesHelper f17776b;
    public final TLRPC.TL_error f17777c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f17778e;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17775a = i10;
        this.f17776b = sendMessagesHelper;
        this.f17777c = tL_error;
        this.d = n2Var;
        this.f17778e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17775a) {
            case 0:
                this.f17776b.lambda$sendEditRichMessageRequest$28(this.f17777c, this.d, this.f17778e);
                return;
            default:
                this.f17776b.lambda$editMessage$23(this.f17777c, this.d, this.f17778e);
                return;
        }
    }
}
