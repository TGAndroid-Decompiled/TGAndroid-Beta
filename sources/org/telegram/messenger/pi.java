package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pi implements Runnable {
    public final int f21274a;
    public final SendMessagesHelper f21275b;
    public final TLRPC.TL_error f21276c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.TL_messages_editMessage f21277e;

    public pi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f21274a = i10;
        this.f21275b = sendMessagesHelper;
        this.f21276c = tL_error;
        this.d = o2Var;
        this.f21277e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f21274a) {
            case 0:
                this.f21275b.lambda$sendEditRichMessageRequest$25(this.f21276c, this.d, this.f21277e);
                return;
            default:
                this.f21275b.lambda$editMessage$20(this.f21276c, this.d, this.f21277e);
                return;
        }
    }
}
