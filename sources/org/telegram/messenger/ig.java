package org.telegram.messenger;
public final class ig implements Runnable {
    public final int f17499a;
    public final MessagesStorage f17500b;
    public final long f17501c;
    public final boolean d;

    public ig(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.f17499a = i10;
        this.f17500b = messagesStorage;
        this.f17501c = j10;
        this.d = z4;
    }

    @Override
    public final void run() {
        switch (this.f17499a) {
            case 0:
                this.f17500b.lambda$setDialogUnread$248(this.f17501c, this.d);
                return;
            default:
                this.f17500b.lambda$setDialogViewThreadAsMessages$249(this.f17501c, this.d);
                return;
        }
    }
}
