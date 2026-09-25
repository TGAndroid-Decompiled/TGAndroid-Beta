package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f16479a;
    public final MessagesStorage f16480b;
    public final long f16481c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16479a = i10;
        this.f16480b = messagesStorage;
        this.f16481c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16479a) {
            case 0:
                this.f16480b.lambda$setDialogUnread$248(this.f16481c, this.d);
                return;
            default:
                this.f16480b.lambda$setDialogViewThreadAsMessages$249(this.f16481c, this.d);
                return;
        }
    }
}
