package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f20217a;
    public final SendMessagesHelper f20218b;
    public final TLRPC.TL_error f20219c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final TLRPC.TL_messages_editMessage f20220e;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f20217a = i10;
        this.f20218b = sendMessagesHelper;
        this.f20219c = tL_error;
        this.d = p2Var;
        this.f20220e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f20217a) {
            case 0:
                this.f20218b.lambda$sendEditRichMessageRequest$25(this.f20219c, this.d, this.f20220e);
                return;
            default:
                this.f20218b.lambda$editMessage$20(this.f20219c, this.d, this.f20220e);
                return;
        }
    }
}
