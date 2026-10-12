package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18057a;
    public final MessagesController f18058b;
    public final long f18059c;
    public final int d;
    public final boolean f18060e;
    public final int f18061f;
    public final int h;

    public kb(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18057a = i13;
        this.f18058b = messagesController;
        this.f18059c = j3;
        this.d = i10;
        this.f18060e = z10;
        this.f18061f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18057a) {
            case 0:
                int i10 = this.f18061f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18058b.lambda$markDialogAsRead$242(this.f18059c, i12, this.f18060e, i10, i11);
                return;
            default:
                int i13 = this.f18061f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18058b.lambda$markDialogAsRead$243(this.f18059c, i15, this.f18060e, i13, i14);
                return;
        }
    }
}
