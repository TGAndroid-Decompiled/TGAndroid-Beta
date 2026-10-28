package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fj implements Runnable {
    public final int f20107a;
    public final SendMessagesHelper f20108b;
    public final TLRPC.TL_error f20109c;
    public final org.telegram.ui.ActionBar.r2 d;
    public final TLRPC.TL_messages_editMessage e;

    public fj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f20107a = i10;
        this.f20108b = sendMessagesHelper;
        this.f20109c = tL_error;
        this.d = r2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f20107a) {
            case 0:
                this.f20108b.lambda$sendEditRichMessageRequest$28(this.f20109c, this.d, this.e);
                return;
            default:
                this.f20108b.lambda$editMessage$23(this.f20109c, this.d, this.e);
                return;
        }
    }
}
