package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17960a;
    public final MessagesStorage f17961b;
    public final long f17962c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17960a = i10;
        this.f17961b = messagesStorage;
        this.f17962c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17960a) {
            case 0:
                this.f17961b.lambda$setDialogUnread$248(this.f17962c, this.d);
                return;
            default:
                this.f17961b.lambda$setDialogViewThreadAsMessages$249(this.f17962c, this.d);
                return;
        }
    }
}
