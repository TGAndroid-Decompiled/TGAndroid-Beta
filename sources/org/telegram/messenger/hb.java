package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f18038a;
    public final MessagesController f18039b;
    public final long f18040c;
    public final int d;
    public final boolean f18041e;
    public final int f18042f;
    public final int h;

    public hb(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18038a = i13;
        this.f18039b = messagesController;
        this.f18040c = j3;
        this.d = i10;
        this.f18041e = z10;
        this.f18042f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18038a) {
            case 0:
                int i10 = this.f18042f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18039b.lambda$markDialogAsRead$242(this.f18040c, i12, this.f18041e, i10, i11);
                return;
            default:
                int i13 = this.f18042f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18039b.lambda$markDialogAsRead$243(this.f18040c, i15, this.f18041e, i13, i14);
                return;
        }
    }
}
