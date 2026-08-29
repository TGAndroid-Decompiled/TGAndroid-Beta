package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f20353a;
    public final MessagesStorage f20354b;
    public final long f20355c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20353a = i10;
        this.f20354b = messagesStorage;
        this.f20355c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20353a) {
            case 0:
                this.f20354b.lambda$setDialogUnread$248(this.f20355c, this.d);
                return;
            default:
                this.f20354b.lambda$setDialogViewThreadAsMessages$249(this.f20355c, this.d);
                return;
        }
    }
}
