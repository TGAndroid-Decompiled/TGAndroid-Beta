package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18780a;
    public final MessagesController f18781b;
    public final long f18782c;
    public final int d;
    public final boolean e;
    public final int f18783f;
    public final int h;

    public kb(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18780a = i13;
        this.f18781b = messagesController;
        this.f18782c = j10;
        this.d = i10;
        this.e = z10;
        this.f18783f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18780a) {
            case 0:
                int i10 = this.f18783f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18781b.lambda$markDialogAsRead$242(this.f18782c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f18783f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18781b.lambda$markDialogAsRead$243(this.f18782c, i15, this.e, i13, i14);
                return;
        }
    }
}
