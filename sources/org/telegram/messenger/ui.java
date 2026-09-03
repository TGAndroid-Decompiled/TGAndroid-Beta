package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ui implements Runnable {
    public final int f18589a;
    public final SendMessagesHelper f18590b;
    public final TLRPC.TL_error f18591c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final TLRPC.TL_messages_editMessage e;

    public ui(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18589a = i10;
        this.f18590b = sendMessagesHelper;
        this.f18591c = tL_error;
        this.d = p2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18589a) {
            case 0:
                this.f18590b.lambda$sendEditRichMessageRequest$25(this.f18591c, this.d, this.e);
                return;
            default:
                this.f18590b.lambda$editMessage$20(this.f18591c, this.d, this.e);
                return;
        }
    }
}
