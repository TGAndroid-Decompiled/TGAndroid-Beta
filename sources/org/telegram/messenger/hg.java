package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f18535a;
    public final MessagesStorage f18536b;
    public final long f18537c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18535a = i10;
        this.f18536b = messagesStorage;
        this.f18537c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18535a) {
            case 0:
                this.f18536b.lambda$setDialogUnread$248(this.f18537c, this.d);
                return;
            default:
                this.f18536b.lambda$setDialogViewThreadAsMessages$249(this.f18537c, this.d);
                return;
        }
    }
}
