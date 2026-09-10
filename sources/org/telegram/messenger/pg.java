package org.telegram.messenger;
public final class pg implements Runnable {
    public final int f16064a;
    public final MessagesStorage f16065b;
    public final long f16066c;
    public final boolean d;

    public pg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16064a = i10;
        this.f16065b = messagesStorage;
        this.f16066c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16064a) {
            case 0:
                this.f16065b.lambda$setDialogUnread$248(this.f16066c, this.d);
                return;
            default:
                this.f16065b.lambda$setDialogViewThreadAsMessages$249(this.f16066c, this.d);
                return;
        }
    }
}
