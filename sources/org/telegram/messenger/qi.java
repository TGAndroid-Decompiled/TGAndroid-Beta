package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f19005a;
    public final SendMessagesHelper f19006b;
    public final TLRPC.TL_error f19007c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f19008e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f19005a = i10;
        this.f19006b = sendMessagesHelper;
        this.f19007c = tL_error;
        this.d = n2Var;
        this.f19008e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f19005a) {
            case 0:
                this.f19006b.lambda$sendEditRichMessageRequest$25(this.f19007c, this.d, this.f19008e);
                return;
            default:
                this.f19006b.lambda$editMessage$20(this.f19007c, this.d, this.f19008e);
                return;
        }
    }
}
