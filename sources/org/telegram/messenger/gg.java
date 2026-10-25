package org.telegram.messenger;
public final class gg implements Runnable {
    public final int f20180a;
    public final MessagesStorage f20181b;
    public final long f20182c;
    public final boolean d;

    public gg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20180a = i10;
        this.f20181b = messagesStorage;
        this.f20182c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20180a) {
            case 0:
                this.f20181b.lambda$setDialogUnread$251(this.f20182c, this.d);
                return;
            default:
                this.f20181b.lambda$setDialogViewThreadAsMessages$252(this.f20182c, this.d);
                return;
        }
    }
}
