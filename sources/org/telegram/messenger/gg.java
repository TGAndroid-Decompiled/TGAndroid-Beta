package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f16486a;
    public final MessagesStorage f16487b;
    public final long f16488c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16486a = i10;
        this.f16487b = messagesStorage;
        this.f16488c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16486a) {
            case 0:
                this.f16487b.lambda$setDialogUnread$248(this.f16488c, this.d);
                return;
            default:
                this.f16487b.lambda$setDialogViewThreadAsMessages$249(this.f16488c, this.d);
                return;
        }
    }
}
