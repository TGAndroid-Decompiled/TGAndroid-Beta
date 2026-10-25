package org.telegram.messenger;
public final class nb implements Runnable {
    public final int f20764a;
    public final MessagesController f20765b;
    public final long f20766c;
    public final int d;
    public final boolean e;
    public final int f20767f;
    public final int h;

    public nb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f20764a = i13;
        this.f20765b = messagesController;
        this.f20766c = j10;
        this.d = i10;
        this.e = z10;
        this.f20767f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f20764a) {
            case 0:
                int i10 = this.f20767f;
                int i11 = this.h;
                int i12 = this.d;
                this.f20765b.lambda$markDialogAsRead$242(this.f20766c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f20767f;
                int i14 = this.h;
                int i15 = this.d;
                this.f20765b.lambda$markDialogAsRead$243(this.f20766c, i15, this.e, i13, i14);
                return;
        }
    }
}
