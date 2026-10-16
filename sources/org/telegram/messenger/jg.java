package org.telegram.messenger;
public final class jg implements Runnable {
    public final int f17299a;
    public final MessagesStorage f17300b;
    public final long f17301c;
    public final boolean d;

    public jg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f17299a = i10;
        this.f17300b = messagesStorage;
        this.f17301c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17299a) {
            case 0:
                this.f17300b.lambda$setDialogUnread$248(this.f17301c, this.d);
                return;
            default:
                this.f17300b.lambda$setDialogViewThreadAsMessages$249(this.f17301c, this.d);
                return;
        }
    }
}
