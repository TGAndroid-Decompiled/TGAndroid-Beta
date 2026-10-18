package org.telegram.messenger;
public final class dg implements Runnable {
    public final int f18191a;
    public final MessagesStorage f18192b;
    public final long f18193c;
    public final boolean d;

    public dg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18191a = i10;
        this.f18192b = messagesStorage;
        this.f18193c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18191a) {
            case 0:
                this.f18192b.lambda$setDialogUnread$248(this.f18193c, this.d);
                return;
            default:
                this.f18192b.lambda$setDialogViewThreadAsMessages$249(this.f18193c, this.d);
                return;
        }
    }
}
