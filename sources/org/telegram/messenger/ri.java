package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ri implements Runnable {
    public final int f17261a;
    public final SendMessagesHelper f17262b;
    public final TLRPC.TL_error f17263c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.TL_messages_editMessage e;

    public ri(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f17261a = i10;
        this.f17262b = sendMessagesHelper;
        this.f17263c = tL_error;
        this.d = o2Var;
        this.e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f17261a) {
            case 0:
                this.f17262b.lambda$sendEditRichMessageRequest$25(this.f17263c, this.d, this.e);
                return;
            default:
                this.f17262b.lambda$editMessage$20(this.f17263c, this.d, this.e);
                return;
        }
    }
}
