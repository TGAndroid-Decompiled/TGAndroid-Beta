package org.telegram.messenger;
public final class jg implements Runnable {
    public final int f17604a;
    public final MessagesStorage f17605b;
    public final long f17606c;
    public final boolean d;

    public jg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f17604a = i10;
        this.f17605b = messagesStorage;
        this.f17606c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17604a) {
            case 0:
                this.f17605b.lambda$setDialogUnread$248(this.f17606c, this.d);
                return;
            default:
                this.f17605b.lambda$setDialogViewThreadAsMessages$249(this.f17606c, this.d);
                return;
        }
    }
}
