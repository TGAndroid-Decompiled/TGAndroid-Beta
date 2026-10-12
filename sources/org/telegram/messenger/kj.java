package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kj implements Runnable {
    public final int f18094a;
    public final SendMessagesHelper f18095b;
    public final TLRPC.TL_error f18096c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage f18097e;

    public kj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18094a = i10;
        this.f18095b = sendMessagesHelper;
        this.f18096c = tL_error;
        this.d = m2Var;
        this.f18097e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18094a) {
            case 0:
                this.f18095b.lambda$sendEditRichMessageRequest$28(this.f18096c, this.d, this.f18097e);
                return;
            default:
                this.f18095b.lambda$editMessage$23(this.f18096c, this.d, this.f18097e);
                return;
        }
    }
}
