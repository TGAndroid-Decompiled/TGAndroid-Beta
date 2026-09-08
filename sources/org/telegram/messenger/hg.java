package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f17918a;
    public final MessagesStorage f17919b;
    public final long f17920c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17918a = i10;
        this.f17919b = messagesStorage;
        this.f17920c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17918a) {
            case 0:
                this.f17919b.lambda$setDialogUnread$248(this.f17920c, this.d);
                return;
            default:
                this.f17919b.lambda$setDialogViewThreadAsMessages$249(this.f17920c, this.d);
                return;
        }
    }
}
