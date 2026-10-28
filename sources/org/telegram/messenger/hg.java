package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f20257a;
    public final MessagesStorage f20258b;
    public final long f20259c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20257a = i10;
        this.f20258b = messagesStorage;
        this.f20259c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20257a) {
            case 0:
                this.f20258b.lambda$setDialogUnread$252(this.f20259c, this.d);
                return;
            default:
                this.f20258b.lambda$setDialogViewThreadAsMessages$253(this.f20259c, this.d);
                return;
        }
    }
}
