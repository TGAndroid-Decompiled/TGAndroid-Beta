package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class mi implements Runnable {

    public final int f21000a;

    public final SendMessagesHelper f21001b;

    public final TLRPC.TL_error f21002c;
    public final org.telegram.ui.ActionBar.n2 d;

    public final TLRPC.TL_messages_editMessage f21003e;

    public mi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f21000a = i10;
        this.f21001b = sendMessagesHelper;
        this.f21002c = tL_error;
        this.d = n2Var;
        this.f21003e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f21000a) {
            case 0:
                this.f21001b.lambda$sendEditRichMessageRequest$25(this.f21002c, this.d, this.f21003e);
                break;
            default:
                this.f21001b.lambda$editMessage$20(this.f21002c, this.d, this.f21003e);
                break;
        }
    }
}
