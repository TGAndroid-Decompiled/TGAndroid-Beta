package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f16332a;
    public final MessagesStorage f16333b;
    public final long f16334c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16332a = i10;
        this.f16333b = messagesStorage;
        this.f16334c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16332a) {
            case 0:
                this.f16333b.lambda$setDialogUnread$248(this.f16334c, this.d);
                return;
            default:
                this.f16333b.lambda$setDialogViewThreadAsMessages$249(this.f16334c, this.d);
                return;
        }
    }
}
