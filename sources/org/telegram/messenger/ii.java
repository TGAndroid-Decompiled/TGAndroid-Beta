package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ii implements Runnable {
    public final int f20608a;
    public final SendMessagesHelper f20609b;
    public final TLRPC.TL_error f20610c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final TLRPC.TL_messages_editMessage f20611e;

    public ii(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_messages_editMessage tL_messages_editMessage, int i9) {
        this.f20608a = i9;
        this.f20609b = sendMessagesHelper;
        this.f20610c = tL_error;
        this.d = o2Var;
        this.f20611e = tL_messages_editMessage;
    }

    @Override
    public final void run() {
        switch (this.f20608a) {
            case 0:
                this.f20609b.lambda$sendEditRichMessageRequest$25(this.f20610c, this.d, this.f20611e);
                return;
            default:
                this.f20609b.lambda$editMessage$20(this.f20610c, this.d, this.f20611e);
                return;
        }
    }
}
