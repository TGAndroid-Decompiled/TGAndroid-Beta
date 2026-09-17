package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17834a;
    public final MessagesStorage f17835b;
    public final long f17836c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17834a = i10;
        this.f17835b = messagesStorage;
        this.f17836c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17834a) {
            case 0:
                this.f17835b.lambda$setDialogUnread$248(this.f17836c, this.d);
                return;
            default:
                this.f17835b.lambda$setDialogViewThreadAsMessages$249(this.f17836c, this.d);
                return;
        }
    }
}
