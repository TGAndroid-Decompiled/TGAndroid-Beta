package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f16338a;
    public final MessagesStorage f16339b;
    public final long f16340c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16338a = i10;
        this.f16339b = messagesStorage;
        this.f16340c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16338a) {
            case 0:
                this.f16339b.lambda$setDialogUnread$248(this.f16340c, this.d);
                return;
            default:
                this.f16339b.lambda$setDialogViewThreadAsMessages$249(this.f16340c, this.d);
                return;
        }
    }
}
