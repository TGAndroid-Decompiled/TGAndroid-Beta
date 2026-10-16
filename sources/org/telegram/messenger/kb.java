package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f17376a;
    public final MessagesController f17377b;
    public final long f17378c;
    public final int d;
    public final boolean e;
    public final int f17379f;
    public final int h;

    public kb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f17376a = i13;
        this.f17377b = messagesController;
        this.f17378c = j10;
        this.d = i10;
        this.e = z10;
        this.f17379f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f17376a) {
            case 0:
                int i10 = this.f17379f;
                int i11 = this.h;
                int i12 = this.d;
                this.f17377b.lambda$markDialogAsRead$242(this.f17378c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f17379f;
                int i14 = this.h;
                int i15 = this.d;
                this.f17377b.lambda$markDialogAsRead$243(this.f17378c, i15, this.e, i13, i14);
                return;
        }
    }
}
