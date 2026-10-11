package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f17813a;
    public final SendMessagesHelper f17814b;
    public final TLRPC.TL_error f17815c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage f17816e;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17813a = i10;
        this.f17814b = sendMessagesHelper;
        this.f17815c = tL_error;
        this.d = m2Var;
        this.f17816e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17813a) {
            case 0:
                this.f17814b.lambda$sendEditRichMessageRequest$28(this.f17815c, this.d, this.f17816e);
                return;
            default:
                this.f17814b.lambda$editMessage$23(this.f17815c, this.d, this.f17816e);
                return;
        }
    }
}
