package org.telegram.messenger;
public final class dg implements Runnable {
    public final int f18194a;
    public final MessagesStorage f18195b;
    public final long f18196c;
    public final boolean d;

    public dg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18194a = i10;
        this.f18195b = messagesStorage;
        this.f18196c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18194a) {
            case 0:
                this.f18195b.lambda$setDialogUnread$248(this.f18196c, this.d);
                return;
            default:
                this.f18195b.lambda$setDialogViewThreadAsMessages$249(this.f18196c, this.d);
                return;
        }
    }
}
