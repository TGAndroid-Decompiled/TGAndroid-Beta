package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f16578a;
    public final MessagesStorage f16579b;
    public final long f16580c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16578a = i10;
        this.f16579b = messagesStorage;
        this.f16580c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16578a) {
            case 0:
                this.f16579b.lambda$setDialogUnread$248(this.f16580c, this.d);
                return;
            default:
                this.f16579b.lambda$setDialogViewThreadAsMessages$249(this.f16580c, this.d);
                return;
        }
    }
}
