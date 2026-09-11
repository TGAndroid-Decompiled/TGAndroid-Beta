package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17807a;
    public final MessagesStorage f17808b;
    public final long f17809c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17807a = i10;
        this.f17808b = messagesStorage;
        this.f17809c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17807a) {
            case 0:
                this.f17808b.lambda$setDialogUnread$248(this.f17809c, this.d);
                return;
            default:
                this.f17808b.lambda$setDialogViewThreadAsMessages$249(this.f17809c, this.d);
                return;
        }
    }
}
