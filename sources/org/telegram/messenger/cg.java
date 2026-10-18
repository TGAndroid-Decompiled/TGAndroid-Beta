package org.telegram.messenger;
public final class cg implements Runnable {
    public final int f18113a;
    public final MessagesStorage f18114b;
    public final long f18115c;
    public final boolean d;

    public cg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18113a = i10;
        this.f18114b = messagesStorage;
        this.f18115c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18113a) {
            case 0:
                this.f18114b.lambda$setDialogUnread$248(this.f18115c, this.d);
                return;
            default:
                this.f18114b.lambda$setDialogViewThreadAsMessages$249(this.f18115c, this.d);
                return;
        }
    }
}
