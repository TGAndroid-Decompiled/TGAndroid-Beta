package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f18839a;
    public final SendMessagesHelper f18840b;
    public final TLRPC.TL_error f18841c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f18842e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18839a = i10;
        this.f18840b = sendMessagesHelper;
        this.f18841c = tL_error;
        this.d = n2Var;
        this.f18842e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18839a) {
            case 0:
                this.f18840b.lambda$sendEditRichMessageRequest$25(this.f18841c, this.d, this.f18842e);
                return;
            default:
                this.f18840b.lambda$editMessage$20(this.f18841c, this.d, this.f18842e);
                return;
        }
    }
}
