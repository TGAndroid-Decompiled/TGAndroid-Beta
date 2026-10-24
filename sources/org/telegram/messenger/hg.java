package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f18600a;
    public final MessagesStorage f18601b;
    public final long f18602c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18600a = i10;
        this.f18601b = messagesStorage;
        this.f18602c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18600a) {
            case 0:
                this.f18601b.lambda$setDialogUnread$248(this.f18602c, this.d);
                return;
            default:
                this.f18601b.lambda$setDialogViewThreadAsMessages$249(this.f18602c, this.d);
                return;
        }
    }
}
