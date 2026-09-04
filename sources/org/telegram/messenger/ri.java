package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f18914a;
    public final SendMessagesHelper f18915b;
    public final TLRPC.TL_error f18916c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f18917e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18914a = i10;
        this.f18915b = sendMessagesHelper;
        this.f18916c = tL_error;
        this.d = n2Var;
        this.f18917e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18914a) {
            case 0:
                this.f18915b.lambda$sendEditRichMessageRequest$25(this.f18916c, this.d, this.f18917e);
                return;
            default:
                this.f18915b.lambda$editMessage$20(this.f18916c, this.d, this.f18917e);
                return;
        }
    }
}
