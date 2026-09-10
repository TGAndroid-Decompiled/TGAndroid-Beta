package org.telegram.messenger;
public final class fa implements Runnable {
    public final int f15159a;
    public final MessagesController f15160b;
    public final long f15161c;
    public final int d;
    public final boolean e;
    public final int f15162f;
    public final int h;

    public fa(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f15159a = i13;
        this.f15160b = messagesController;
        this.f15161c = j3;
        this.d = i10;
        this.e = z10;
        this.f15162f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f15159a) {
            case 0:
                int i10 = this.f15162f;
                int i11 = this.h;
                int i12 = this.d;
                this.f15160b.lambda$markDialogAsRead$243(this.f15161c, i12, this.e, i10, i11);
                return;
            default:
                int i13 = this.f15162f;
                int i14 = this.h;
                int i15 = this.d;
                this.f15160b.lambda$markDialogAsRead$244(this.f15161c, i15, this.e, i13, i14);
                return;
        }
    }
}
