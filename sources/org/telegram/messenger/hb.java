package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f18040a;
    public final MessagesController f18041b;
    public final long f18042c;
    public final int d;
    public final boolean f18043e;
    public final int f18044f;
    public final int h;

    public hb(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18040a = i13;
        this.f18041b = messagesController;
        this.f18042c = j3;
        this.d = i10;
        this.f18043e = z10;
        this.f18044f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18040a) {
            case 0:
                int i10 = this.f18044f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18041b.lambda$markDialogAsRead$242(this.f18042c, i12, this.f18043e, i10, i11);
                return;
            default:
                int i13 = this.f18044f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18041b.lambda$markDialogAsRead$243(this.f18042c, i15, this.f18043e, i13, i14);
                return;
        }
    }
}
