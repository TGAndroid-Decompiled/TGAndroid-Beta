package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f17403a;
    public final SendMessagesHelper f17404b;
    public final TLRPC.TL_error f17405c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.TL_messages_editMessage e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17403a = i10;
        this.f17404b = sendMessagesHelper;
        this.f17405c = tL_error;
        this.d = o2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17403a) {
            case 0:
                this.f17404b.lambda$sendEditRichMessageRequest$25(this.f17405c, this.d, this.e);
                return;
            default:
                this.f17404b.lambda$editMessage$20(this.f17405c, this.d, this.e);
                return;
        }
    }
}
