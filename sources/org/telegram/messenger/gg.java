package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f16475a;
    public final MessagesStorage f16476b;
    public final long f16477c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f16475a = i10;
        this.f16476b = messagesStorage;
        this.f16477c = j3;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16475a) {
            case 0:
                this.f16476b.lambda$setDialogUnread$248(this.f16477c, this.d);
                return;
            default:
                this.f16476b.lambda$setDialogViewThreadAsMessages$249(this.f16477c, this.d);
                return;
        }
    }
}
