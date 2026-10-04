package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f19004a;
    public final SendMessagesHelper f19005b;
    public final TLRPC.TL_error f19006c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f19007e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f19004a = i10;
        this.f19005b = sendMessagesHelper;
        this.f19006c = tL_error;
        this.d = n2Var;
        this.f19007e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f19004a) {
            case 0:
                this.f19005b.lambda$sendEditRichMessageRequest$25(this.f19006c, this.d, this.f19007e);
                return;
            default:
                this.f19005b.lambda$editMessage$20(this.f19006c, this.d, this.f19007e);
                return;
        }
    }
}
