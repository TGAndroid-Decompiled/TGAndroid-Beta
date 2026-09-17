package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qi implements Runnable {
    public final int f18866a;
    public final SendMessagesHelper f18867b;
    public final TLRPC.TL_error f18868c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final TLRPC.TL_messages_editMessage f18869e;

    public qi(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i10) {
        this.f18866a = i10;
        this.f18867b = sendMessagesHelper;
        this.f18868c = tL_error;
        this.d = n2Var;
        this.f18869e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f18866a) {
            case 0:
                this.f18867b.lambda$sendEditRichMessageRequest$25(this.f18868c, this.d, this.f18869e);
                return;
            default:
                this.f18867b.lambda$editMessage$20(this.f18868c, this.d, this.f18869e);
                return;
        }
    }
}
