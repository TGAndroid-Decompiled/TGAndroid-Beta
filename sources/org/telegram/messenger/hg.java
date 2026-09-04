package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f17891a;
    public final MessagesStorage f17892b;
    public final long f17893c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17891a = i10;
        this.f17892b = messagesStorage;
        this.f17893c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17891a) {
            case 0:
                this.f17892b.lambda$setDialogUnread$248(this.f17893c, this.d);
                return;
            default:
                this.f17892b.lambda$setDialogViewThreadAsMessages$249(this.f17893c, this.d);
                return;
        }
    }
}
