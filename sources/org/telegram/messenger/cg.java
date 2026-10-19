package org.telegram.messenger;
public final class cg implements Runnable {
    public final int f18110a;
    public final MessagesStorage f18111b;
    public final long f18112c;
    public final boolean d;

    public cg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18110a = i10;
        this.f18111b = messagesStorage;
        this.f18112c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18110a) {
            case 0:
                this.f18111b.lambda$setDialogUnread$248(this.f18112c, this.d);
                return;
            default:
                this.f18111b.lambda$setDialogViewThreadAsMessages$249(this.f18112c, this.d);
                return;
        }
    }
}
