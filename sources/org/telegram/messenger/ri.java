package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f19097a;
    public final SendMessagesHelper f19098b;
    public final TLRPC.TL_error f19099c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f19100e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f19097a = i10;
        this.f19098b = sendMessagesHelper;
        this.f19099c = tL_error;
        this.d = n2Var;
        this.f19100e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f19097a) {
            case 0:
                this.f19098b.lambda$sendEditRichMessageRequest$25(this.f19099c, this.d, this.f19100e);
                return;
            default:
                this.f19098b.lambda$editMessage$20(this.f19099c, this.d, this.f19100e);
                return;
        }
    }
}
