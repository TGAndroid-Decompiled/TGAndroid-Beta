package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18848a;
    public final MessagesController f18849b;
    public final long f18850c;
    public final int d;
    public final boolean e;
    public final int f18851f;
    public final int h;

    public kb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18848a = i13;
        this.f18849b = messagesController;
        this.f18850c = j10;
        this.d = i10;
        this.e = z10;
        this.f18851f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18848a) {
            case 0:
                int i10 = this.f18851f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18849b.lambda$markDialogAsRead$242(this.f18850c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18851f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18849b.lambda$markDialogAsRead$243(this.f18850c, i15, this.e, i13, i14);
                return;
        }
    }
}
