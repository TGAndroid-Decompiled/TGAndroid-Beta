package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17489a;
    public final SendMessagesHelper f17490b;
    public final TLRPC.TL_error f17491c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17489a = i10;
        this.f17490b = sendMessagesHelper;
        this.f17491c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17489a) {
            case 0:
                this.f17490b.lambda$sendEditRichMessageRequest$25(this.f17491c, this.d, this.e);
                return;
            default:
                this.f17490b.lambda$editMessage$20(this.f17491c, this.d, this.e);
                return;
        }
    }
}
