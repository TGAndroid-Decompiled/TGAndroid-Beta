package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f17777a;
    public final SendMessagesHelper f17778b;
    public final TLRPC.TL_error f17779c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage f17780e;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17777a = i10;
        this.f17778b = sendMessagesHelper;
        this.f17779c = tL_error;
        this.d = m2Var;
        this.f17780e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17777a) {
            case 0:
                this.f17778b.lambda$sendEditRichMessageRequest$28(this.f17779c, this.d, this.f17780e);
                return;
            default:
                this.f17778b.lambda$editMessage$23(this.f17779c, this.d, this.f17780e);
                return;
        }
    }
}
