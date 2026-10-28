package org.telegram.messenger;
public final class pb implements Runnable {
    public final int f20945a;
    public final MessagesController f20946b;
    public final long f20947c;
    public final int d;
    public final boolean e;
    public final int f20948f;
    public final int h;

    public pb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f20945a = i13;
        this.f20946b = messagesController;
        this.f20947c = j10;
        this.d = i10;
        this.e = z10;
        this.f20948f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f20945a) {
            case 0:
                int i10 = this.f20948f;
                int i11 = this.h;
                int i12 = this.d;
                this.f20946b.lambda$markDialogAsRead$242(this.f20947c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f20948f;
                int i14 = this.h;
                int i15 = this.d;
                this.f20946b.lambda$markDialogAsRead$243(this.f20947c, i15, this.e, i13, i14);
                return;
        }
    }
}
