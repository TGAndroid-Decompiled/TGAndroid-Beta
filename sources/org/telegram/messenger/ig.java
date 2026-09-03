package org.telegram.messenger;
public final class ig implements Runnable {
    public final int f18978a;
    public final MessagesStorage f18979b;
    public final long f18980c;
    public final boolean d;

    public ig(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.f18978a = i10;
        this.f18979b = messagesStorage;
        this.f18980c = j10;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f18978a) {
            case 0:
                this.f18979b.lambda$setDialogUnread$248(this.f18980c, this.d);
                return;
            default:
                this.f18979b.lambda$setDialogViewThreadAsMessages$249(this.f18980c, this.d);
                return;
        }
    }
}
