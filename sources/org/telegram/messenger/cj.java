package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cj implements Runnable {
    public final int f18165a;
    public final SendMessagesHelper f18166b;
    public final TLRPC.TL_error f18167c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.TL_messages_editMessage e;

    public cj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18165a = i10;
        this.f18166b = sendMessagesHelper;
        this.f18167c = tL_error;
        this.d = o2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18165a) {
            case 0:
                this.f18166b.lambda$sendEditRichMessageRequest$28(this.f18167c, this.d, this.e);
                return;
            default:
                this.f18166b.lambda$editMessage$23(this.f18167c, this.d, this.e);
                return;
        }
    }
}
