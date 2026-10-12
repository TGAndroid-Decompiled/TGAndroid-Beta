package org.telegram.messenger;
public final class kb implements Runnable {
    public final int f18056a;
    public final MessagesController f18057b;
    public final long f18058c;
    public final int d;
    public final boolean f18059e;
    public final int f18060f;
    public final int h;

    public kb(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f18056a = i13;
        this.f18057b = messagesController;
        this.f18058c = j3;
        this.d = i10;
        this.f18059e = z10;
        this.f18060f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18056a) {
            case 0:
                int i10 = this.f18060f;
                int i11 = this.h;
                int i12 = this.d;
                this.f18057b.lambda$markDialogAsRead$242(this.f18058c, i12, this.f18059e, i10, i11);
                return;
            default:
                int i13 = this.f18060f;
                int i14 = this.h;
                int i15 = this.d;
                this.f18057b.lambda$markDialogAsRead$243(this.f18058c, i15, this.f18059e, i13, i14);
                return;
        }
    }
}
