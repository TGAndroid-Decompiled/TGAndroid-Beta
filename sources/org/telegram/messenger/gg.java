package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f18458a;
    public final MessagesStorage f18459b;
    public final long f18460c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18458a = i10;
        this.f18459b = messagesStorage;
        this.f18460c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18458a) {
            case 0:
                this.f18459b.lambda$setDialogUnread$248(this.f18460c, this.d);
                return;
            default:
                this.f18459b.lambda$setDialogViewThreadAsMessages$249(this.f18460c, this.d);
                return;
        }
    }
}
