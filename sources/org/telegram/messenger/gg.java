package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f17971a;
    public final MessagesStorage f17972b;
    public final long f17973c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17971a = i10;
        this.f17972b = messagesStorage;
        this.f17973c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f17971a) {
            case 0:
                this.f17972b.lambda$setDialogUnread$248(this.f17973c, this.d);
                return;
            default:
                this.f17972b.lambda$setDialogViewThreadAsMessages$249(this.f17973c, this.d);
                return;
        }
    }
}
