package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17963a;
    public final MessagesStorage f17964b;
    public final long f17965c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17963a = i10;
        this.f17964b = messagesStorage;
        this.f17965c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17963a) {
            case 0:
                this.f17964b.lambda$setDialogUnread$248(this.f17965c, this.d);
                return;
            default:
                this.f17964b.lambda$setDialogViewThreadAsMessages$249(this.f17965c, this.d);
                return;
        }
    }
}
