package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f18612a;
    public final MessagesController f18613b;
    public final long f18614c;
    public final int d;
    public final boolean e;
    public final int f18615f;
    public final int h;

    public ib(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18612a = i13;
        this.f18613b = messagesController;
        this.f18614c = j10;
        this.d = i10;
        this.e = z10;
        this.f18615f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18612a) {
            case 0:
                int i10 = this.f18615f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18613b.lambda$markDialogAsRead$242(this.f18614c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18615f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18613b.lambda$markDialogAsRead$243(this.f18614c, i15, this.e, i13, i14);
                return;
        }
    }
}
