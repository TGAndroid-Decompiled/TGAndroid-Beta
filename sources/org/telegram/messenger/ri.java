package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f19102a;
    public final SendMessagesHelper f19103b;
    public final TLRPC.TL_error f19104c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f19105e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f19102a = i10;
        this.f19103b = sendMessagesHelper;
        this.f19104c = tL_error;
        this.d = n2Var;
        this.f19105e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f19102a) {
            case 0:
                this.f19103b.lambda$sendEditRichMessageRequest$25(this.f19104c, this.d, this.f19105e);
                return;
            default:
                this.f19103b.lambda$editMessage$20(this.f19104c, this.d, this.f19105e);
                return;
        }
    }
}
