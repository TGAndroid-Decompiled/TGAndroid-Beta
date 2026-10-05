package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17976a;
    public final MessagesStorage f17977b;
    public final long f17978c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17976a = i10;
        this.f17977b = messagesStorage;
        this.f17978c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17976a) {
            case 0:
                this.f17977b.lambda$setDialogUnread$248(this.f17978c, this.d);
                return;
            default:
                this.f17977b.lambda$setDialogViewThreadAsMessages$249(this.f17978c, this.d);
                return;
        }
    }
}
