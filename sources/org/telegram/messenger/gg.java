package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17999a;
    public final MessagesStorage f18000b;
    public final long f18001c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17999a = i10;
        this.f18000b = messagesStorage;
        this.f18001c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17999a) {
            case 0:
                this.f18000b.lambda$setDialogUnread$248(this.f18001c, this.d);
                return;
            default:
                this.f18000b.lambda$setDialogViewThreadAsMessages$249(this.f18001c, this.d);
                return;
        }
    }
}
