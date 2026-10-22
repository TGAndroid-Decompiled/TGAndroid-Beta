package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f18101a;
    public final SendMessagesHelper f18102b;
    public final TLRPC.TL_error f18103c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage e;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18101a = i10;
        this.f18102b = sendMessagesHelper;
        this.f18103c = tL_error;
        this.d = n2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18101a) {
            case 0:
                this.f18102b.lambda$sendEditRichMessageRequest$28(this.f18103c, this.d, this.e);
                return;
            default:
                this.f18102b.lambda$editMessage$23(this.f18103c, this.d, this.e);
                return;
        }
    }
}
