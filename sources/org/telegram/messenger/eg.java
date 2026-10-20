package org.telegram.messenger;
public final class eg implements Runnable {
    public final int f18287a;
    public final MessagesStorage f18288b;
    public final long f18289c;
    public final boolean d;

    public eg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18287a = i10;
        this.f18288b = messagesStorage;
        this.f18289c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f18287a) {
            case 0:
                this.f18288b.lambda$setDialogUnread$248(this.f18289c, this.d);
                return;
            default:
                this.f18288b.lambda$setDialogViewThreadAsMessages$249(this.f18289c, this.d);
                return;
        }
    }
}
