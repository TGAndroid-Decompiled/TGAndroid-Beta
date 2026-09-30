package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f16503a;
    public final MessagesStorage f16504b;
    public final long f16505c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16503a = i10;
        this.f16504b = messagesStorage;
        this.f16505c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16503a) {
            case 0:
                this.f16504b.lambda$setDialogUnread$248(this.f16505c, this.d);
                return;
            default:
                this.f16504b.lambda$setDialogViewThreadAsMessages$249(this.f16505c, this.d);
                return;
        }
    }
}
