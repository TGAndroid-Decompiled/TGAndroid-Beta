package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f16487a;
    public final MessagesStorage f16488b;
    public final long f16489c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16487a = i10;
        this.f16488b = messagesStorage;
        this.f16489c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16487a) {
            case 0:
                this.f16488b.lambda$setDialogUnread$248(this.f16489c, this.d);
                return;
            default:
                this.f16488b.lambda$setDialogViewThreadAsMessages$249(this.f16489c, this.d);
                return;
        }
    }
}
