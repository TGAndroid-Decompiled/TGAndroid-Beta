package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17975a;
    public final MessagesStorage f17976b;
    public final long f17977c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17975a = i10;
        this.f17976b = messagesStorage;
        this.f17977c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17975a) {
            case 0:
                this.f17976b.lambda$setDialogUnread$248(this.f17977c, this.d);
                return;
            default:
                this.f17976b.lambda$setDialogViewThreadAsMessages$249(this.f17977c, this.d);
                return;
        }
    }
}
