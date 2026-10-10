package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f18042a;
    public final MessagesController f18043b;
    public final long f18044c;
    public final int d;
    public final boolean f18045e;
    public final int f18046f;
    public final int h;

    public hb(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18042a = i13;
        this.f18043b = messagesController;
        this.f18044c = j3;
        this.d = i10;
        this.f18045e = z10;
        this.f18046f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18042a) {
            case 0:
                int i10 = this.f18046f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18043b.lambda$markDialogAsRead$242(this.f18044c, i12, this.f18045e, i10, i11);
                return;
            default:
                int i13 = this.f18046f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18043b.lambda$markDialogAsRead$243(this.f18044c, i15, this.f18045e, i13, i14);
                return;
        }
    }
}
