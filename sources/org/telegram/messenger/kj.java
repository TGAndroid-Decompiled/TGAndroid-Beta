package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class kj implements Runnable {
    public final int f18093a;
    public final SendMessagesHelper f18094b;
    public final TLRPC.TL_error f18095c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final TLRPC.TL_messages_editMessage f18096e;

    public kj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18093a = i10;
        this.f18094b = sendMessagesHelper;
        this.f18095c = tL_error;
        this.d = m2Var;
        this.f18096e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18093a) {
            case 0:
                this.f18094b.lambda$sendEditRichMessageRequest$28(this.f18095c, this.d, this.f18096e);
                return;
            default:
                this.f18094b.lambda$editMessage$23(this.f18095c, this.d, this.f18096e);
                return;
        }
    }
}
