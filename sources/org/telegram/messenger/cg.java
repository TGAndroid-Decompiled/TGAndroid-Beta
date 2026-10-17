package org.telegram.messenger;
public final class cg implements Runnable {
    public final int f18098a;
    public final MessagesStorage f18099b;
    public final long f18100c;
    public final boolean d;

    public cg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18098a = i10;
        this.f18099b = messagesStorage;
        this.f18100c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18098a) {
            case 0:
                this.f18099b.lambda$setDialogUnread$248(this.f18100c, this.d);
                return;
            default:
                this.f18099b.lambda$setDialogViewThreadAsMessages$249(this.f18100c, this.d);
                return;
        }
    }
}
