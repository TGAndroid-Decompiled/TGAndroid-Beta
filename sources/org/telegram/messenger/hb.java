package org.telegram.messenger;
public final class hb implements Runnable {
    public final int f18524a;
    public final MessagesController f18525b;
    public final long f18526c;
    public final int d;
    public final boolean e;
    public final int f18527f;
    public final int h;

    public hb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18524a = i13;
        this.f18525b = messagesController;
        this.f18526c = j10;
        this.d = i10;
        this.e = z10;
        this.f18527f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18524a) {
            case 0:
                int i10 = this.f18527f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18525b.lambda$markDialogAsRead$242(this.f18526c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18527f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18525b.lambda$markDialogAsRead$243(this.f18526c, i15, this.e, i13, i14);
                return;
        }
    }
}
