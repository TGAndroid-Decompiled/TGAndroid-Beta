package org.telegram.messenger;
public final class ig implements Runnable {
    public final int f17480a;
    public final MessagesStorage f17481b;
    public final long f17482c;
    public final boolean d;

    public ig(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.f17480a = i10;
        this.f17481b = messagesStorage;
        this.f17482c = j10;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f17480a) {
            case 0:
                this.f17481b.lambda$setDialogUnread$248(this.f17482c, this.d);
                return;
            default:
                this.f17481b.lambda$setDialogViewThreadAsMessages$249(this.f17482c, this.d);
                return;
        }
    }
}
