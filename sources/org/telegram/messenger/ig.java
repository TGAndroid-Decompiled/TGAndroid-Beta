package org.telegram.messenger;
public final class ig implements Runnable {
    public final int f18976a;
    public final MessagesStorage f18977b;
    public final long f18978c;
    public final boolean d;

    public ig(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.f18976a = i10;
        this.f18977b = messagesStorage;
        this.f18978c = j10;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f18976a) {
            case 0:
                this.f18977b.lambda$setDialogUnread$248(this.f18978c, this.d);
                return;
            default:
                this.f18977b.lambda$setDialogViewThreadAsMessages$249(this.f18978c, this.d);
                return;
        }
    }
}
