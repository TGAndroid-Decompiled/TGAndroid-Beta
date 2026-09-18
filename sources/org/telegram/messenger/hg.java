package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f16517a;
    public final MessagesStorage f16518b;
    public final long f16519c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16517a = i10;
        this.f16518b = messagesStorage;
        this.f16519c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16517a) {
            case 0:
                this.f16518b.lambda$setDialogUnread$248(this.f16519c, this.d);
                return;
            default:
                this.f16518b.lambda$setDialogViewThreadAsMessages$249(this.f16519c, this.d);
                return;
        }
    }
}
