package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ti implements Runnable {
    public final int f18522a;
    public final SendMessagesHelper f18523b;
    public final TLRPC.TL_error f18524c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final TLRPC.TL_messages_editMessage e;

    public ti(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18522a = i10;
        this.f18523b = sendMessagesHelper;
        this.f18524c = tL_error;
        this.d = p2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18522a) {
            case 0:
                this.f18523b.lambda$sendEditRichMessageRequest$25(this.f18524c, this.d, this.e);
                return;
            default:
                this.f18523b.lambda$editMessage$20(this.f18524c, this.d, this.e);
                return;
        }
    }
}
