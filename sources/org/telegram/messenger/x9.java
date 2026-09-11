package org.telegram.messenger;
public final class x9 implements Runnable {
    public final int f19617a;
    public final MessagesController f19618b;
    public final long f19619c;
    public final int d;
    public final boolean f19620e;
    public final int f19621f;
    public final int h;

    public x9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19617a = i13;
        this.f19618b = messagesController;
        this.f19619c = j3;
        this.d = i10;
        this.f19620e = z10;
        this.f19621f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19617a) {
            case 0:
                int i10 = this.f19621f;
                int i11 = this.h;
                int i12 = this.d;
                this.f19618b.lambda$markDialogAsRead$243(this.f19619c, i12, this.f19620e, i10, i11);
                return;
            default:
                int i13 = this.f19621f;
                int i14 = this.h;
                int i15 = this.d;
                this.f19618b.lambda$markDialogAsRead$244(this.f19619c, i15, this.f19620e, i13, i14);
                return;
        }
    }
}
