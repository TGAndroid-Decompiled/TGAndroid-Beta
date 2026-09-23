package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f16220a;
    public final MessagesStorage f16221b;
    public final long f16222c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16220a = i10;
        this.f16221b = messagesStorage;
        this.f16222c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16220a) {
            case 0:
                this.f16221b.lambda$setDialogUnread$248(this.f16222c, this.d);
                return;
            default:
                this.f16221b.lambda$setDialogViewThreadAsMessages$249(this.f16222c, this.d);
                return;
        }
    }
}
