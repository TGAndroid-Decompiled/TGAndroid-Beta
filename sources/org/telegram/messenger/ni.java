package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ni implements Runnable {
    public final int f18708a;
    public final SendMessagesHelper f18709b;
    public final TLRPC.Updates f18710c;
    public final TLRPC.Message d;
    public final boolean f18711e;

    public ni(SendMessagesHelper sendMessagesHelper, TLRPC.Updates updates, TLRPC.Message message, boolean z10, int i10) {
        this.f18708a = i10;
        this.f18709b = sendMessagesHelper;
        this.f18710c = updates;
        this.d = message;
        this.f18711e = z10;
    }

    @Override
    public final void run() {
        switch (this.f18708a) {
            case 0:
                this.f18709b.lambda$performSendMessageRequest$88(this.f18710c, this.d, this.f18711e);
                return;
            default:
                this.f18709b.lambda$performSendMessageRequest$91(this.f18710c, this.d, this.f18711e);
                return;
        }
    }
}
