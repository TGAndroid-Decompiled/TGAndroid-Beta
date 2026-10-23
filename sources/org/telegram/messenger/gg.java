package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f18524a;
    public final MessagesStorage f18525b;
    public final long f18526c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18524a = i10;
        this.f18525b = messagesStorage;
        this.f18526c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18524a) {
            case 0:
                this.f18525b.lambda$setDialogUnread$248(this.f18526c, this.d);
                return;
            default:
                this.f18525b.lambda$setDialogViewThreadAsMessages$249(this.f18526c, this.d);
                return;
        }
    }
}
