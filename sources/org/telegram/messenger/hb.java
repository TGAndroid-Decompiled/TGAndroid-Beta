package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f18076a;
    public final MessagesController f18077b;
    public final long f18078c;
    public final int d;
    public final boolean f18079e;
    public final int f18080f;
    public final int h;

    public hb(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18076a = i13;
        this.f18077b = messagesController;
        this.f18078c = j3;
        this.d = i10;
        this.f18079e = z10;
        this.f18080f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18076a) {
            case 0:
                int i10 = this.f18080f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18077b.lambda$markDialogAsRead$242(this.f18078c, i12, this.f18079e, i10, i11);
                return;
            default:
                int i13 = this.f18080f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18077b.lambda$markDialogAsRead$243(this.f18078c, i15, this.f18079e, i13, i14);
                return;
        }
    }
}
