package org.telegram.messenger;
public final class jg implements Runnable {
    public final int f17989a;
    public final MessagesStorage f17990b;
    public final long f17991c;
    public final boolean d;

    public jg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17989a = i10;
        this.f17990b = messagesStorage;
        this.f17991c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17989a) {
            case 0:
                this.f17990b.lambda$setDialogUnread$248(this.f17991c, this.d);
                return;
            default:
                this.f17990b.lambda$setDialogViewThreadAsMessages$249(this.f17991c, this.d);
                return;
        }
    }
}
