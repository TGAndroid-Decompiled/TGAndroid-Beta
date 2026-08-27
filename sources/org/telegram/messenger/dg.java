package org.telegram.messenger;

public final class dg implements Runnable {

    public final int f20058a;

    public final MessagesStorage f20059b;

    public final long f20060c;
    public final boolean d;

    public dg(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20058a = i10;
        this.f20059b = messagesStorage;
        this.f20060c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f20058a) {
            case 0:
                this.f20059b.lambda$setDialogUnread$248(this.f20060c, this.d);
                break;
            default:
                this.f20059b.lambda$setDialogViewThreadAsMessages$249(this.f20060c, this.d);
                break;
        }
    }
}
