package org.telegram.messenger;
public final class ib implements Runnable {
    public final int f18614a;
    public final MessagesController f18615b;
    public final long f18616c;
    public final int d;
    public final boolean e;
    public final int f18617f;
    public final int h;

    public ib(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18614a = i13;
        this.f18615b = messagesController;
        this.f18616c = j10;
        this.d = i10;
        this.e = z10;
        this.f18617f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18614a) {
            case 0:
                int i10 = this.f18617f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18615b.lambda$markDialogAsRead$242(this.f18616c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18617f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18615b.lambda$markDialogAsRead$243(this.f18616c, i15, this.e, i13, i14);
                return;
        }
    }
}
