package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f16464a;
    public final MessagesStorage f16465b;
    public final long f16466c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16464a = i10;
        this.f16465b = messagesStorage;
        this.f16466c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16464a) {
            case 0:
                this.f16465b.lambda$setDialogUnread$248(this.f16466c, this.d);
                return;
            default:
                this.f16465b.lambda$setDialogViewThreadAsMessages$249(this.f16466c, this.d);
                return;
        }
    }
}
