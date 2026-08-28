package org.telegram.messenger;
public final class v9 implements Runnable {
    public final int f21746a;
    public final MessagesController f21747b;
    public final long f21748c;
    public final int d;
    public final boolean f21749e;
    public final int f21750f;
    public final int h;

    public v9(MessagesController messagesController, long j10, int i9, boolean z10, int i10, int i11, int i12) {
        this.f21746a = i12;
        this.f21747b = messagesController;
        this.f21748c = j10;
        this.d = i9;
        this.f21749e = z10;
        this.f21750f = i10;
        this.h = i11;
    }

    @Override
    public final void run() {
        switch (this.f21746a) {
            case 0:
                int i9 = this.f21750f;
                int i10 = this.h;
                int i11 = this.d;
                this.f21747b.lambda$markDialogAsRead$243(this.f21748c, i11, this.f21749e, i9, i10);
                return;
            default:
                int i12 = this.f21750f;
                int i13 = this.h;
                int i14 = this.d;
                this.f21747b.lambda$markDialogAsRead$244(this.f21748c, i14, this.f21749e, i12, i13);
                return;
        }
    }
}
