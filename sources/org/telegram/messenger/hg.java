package org.telegram.messenger;
public final class hg implements Runnable {
    public final int f16563a;
    public final MessagesStorage f16564b;
    public final long f16565c;
    public final boolean d;

    public hg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16563a = i10;
        this.f16564b = messagesStorage;
        this.f16565c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16563a) {
            case 0:
                this.f16564b.lambda$setDialogUnread$248(this.f16565c, this.d);
                return;
            default:
                this.f16564b.lambda$setDialogViewThreadAsMessages$249(this.f16565c, this.d);
                return;
        }
    }
}
