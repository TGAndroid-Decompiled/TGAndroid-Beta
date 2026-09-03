package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f20219a;
    public final SendMessagesHelper f20220b;
    public final TLRPC.TL_error f20221c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final TLRPC.TL_messages_editMessage f20222e;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f20219a = i10;
        this.f20220b = sendMessagesHelper;
        this.f20221c = tL_error;
        this.d = p2Var;
        this.f20222e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f20219a) {
            case 0:
                this.f20220b.lambda$sendEditRichMessageRequest$25(this.f20221c, this.d, this.f20222e);
                return;
            default:
                this.f20220b.lambda$editMessage$20(this.f20221c, this.d, this.f20222e);
                return;
        }
    }
}
