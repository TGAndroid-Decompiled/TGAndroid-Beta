package org.telegram.messenger;
public final class lb implements Runnable {
    public final int f18934a;
    public final MessagesController f18935b;
    public final long f18936c;
    public final int d;
    public final boolean e;
    public final int f18937f;
    public final int h;

    public lb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18934a = i13;
        this.f18935b = messagesController;
        this.f18936c = j10;
        this.d = i10;
        this.e = z10;
        this.f18937f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18934a) {
            case 0:
                int i10 = this.f18937f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18935b.lambda$markDialogAsRead$242(this.f18936c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18937f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18935b.lambda$markDialogAsRead$243(this.f18936c, i15, this.e, i13, i14);
                return;
        }
    }
}
