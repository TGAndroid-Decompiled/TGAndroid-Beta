package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17964a;
    public final MessagesStorage f17965b;
    public final long f17966c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17964a = i10;
        this.f17965b = messagesStorage;
        this.f17966c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17964a) {
            case 0:
                this.f17965b.lambda$setDialogUnread$248(this.f17966c, this.d);
                return;
            default:
                this.f17965b.lambda$setDialogViewThreadAsMessages$249(this.f17966c, this.d);
                return;
        }
    }
}
