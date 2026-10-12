package org.telegram.messenger;
public final class jg implements Runnable {
    public final int f17988a;
    public final MessagesStorage f17989b;
    public final long f17990c;
    public final boolean d;

    public jg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17988a = i10;
        this.f17989b = messagesStorage;
        this.f17990c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17988a) {
            case 0:
                this.f17989b.lambda$setDialogUnread$248(this.f17990c, this.d);
                return;
            default:
                this.f17989b.lambda$setDialogViewThreadAsMessages$249(this.f17990c, this.d);
                return;
        }
    }
}
