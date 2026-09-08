package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f18941a;
    public final SendMessagesHelper f18942b;
    public final TLRPC.TL_error f18943c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f18944e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18941a = i10;
        this.f18942b = sendMessagesHelper;
        this.f18943c = tL_error;
        this.d = n2Var;
        this.f18944e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18941a) {
            case 0:
                this.f18942b.lambda$sendEditRichMessageRequest$25(this.f18943c, this.d, this.f18944e);
                return;
            default:
                this.f18942b.lambda$editMessage$20(this.f18943c, this.d, this.f18944e);
                return;
        }
    }
}
