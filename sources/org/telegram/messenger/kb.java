package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f17677a;
    public final MessagesController f17678b;
    public final long f17679c;
    public final int d;
    public final boolean e;
    public final int f17680f;
    public final int h;

    public kb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f17677a = i13;
        this.f17678b = messagesController;
        this.f17679c = j10;
        this.d = i10;
        this.e = z10;
        this.f17680f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f17677a) {
            case 0:
                int i10 = this.f17680f;
                int i11 = this.h;
                int i12 = this.d;
                this.f17678b.lambda$markDialogAsRead$242(this.f17679c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f17680f;
                int i14 = this.h;
                int i15 = this.d;
                this.f17678b.lambda$markDialogAsRead$243(this.f17679c, i15, this.e, i13, i14);
                return;
        }
    }
}
