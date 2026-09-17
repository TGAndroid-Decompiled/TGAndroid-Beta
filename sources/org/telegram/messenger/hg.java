package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f16347a;
    public final MessagesStorage f16348b;
    public final long f16349c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16347a = i10;
        this.f16348b = messagesStorage;
        this.f16349c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16347a) {
            case 0:
                this.f16348b.lambda$setDialogUnread$248(this.f16349c, this.d);
                return;
            default:
                this.f16348b.lambda$setDialogViewThreadAsMessages$249(this.f16349c, this.d);
                return;
        }
    }
}
