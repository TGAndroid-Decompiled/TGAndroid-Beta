package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ej implements Runnable {
    public final int f20016a;
    public final SendMessagesHelper f20017b;
    public final TLRPC.TL_error f20018c;
    public final org.telegram.ui.ActionBar.r2 d;
    public final TLRPC.TL_messages_editMessage e;

    public ej(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f20016a = i10;
        this.f20017b = sendMessagesHelper;
        this.f20018c = tL_error;
        this.d = r2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f20016a) {
            case 0:
                this.f20017b.lambda$sendEditRichMessageRequest$28(this.f20018c, this.d, this.e);
                return;
            default:
                this.f20017b.lambda$editMessage$23(this.f20018c, this.d, this.e);
                return;
        }
    }
}
