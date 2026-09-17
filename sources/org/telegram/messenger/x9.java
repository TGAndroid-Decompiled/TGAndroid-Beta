package org.telegram.messenger;
public final class x9 implements Runnable {
    public final int f19644a;
    public final MessagesController f19645b;
    public final long f19646c;
    public final int d;
    public final boolean f19647e;
    public final int f19648f;
    public final int h;

    public x9(MessagesController messagesController, long j3, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19644a = i13;
        this.f19645b = messagesController;
        this.f19646c = j3;
        this.d = i10;
        this.f19647e = z10;
        this.f19648f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19644a) {
            case 0:
                int i10 = this.f19648f;
                int i11 = this.h;
                int i12 = this.d;
                this.f19645b.lambda$markDialogAsRead$243(this.f19646c, i12, this.f19647e, i10, i11);
                return;
            default:
                int i13 = this.f19648f;
                int i14 = this.h;
                int i15 = this.d;
                this.f19645b.lambda$markDialogAsRead$244(this.f19646c, i15, this.f19647e, i13, i14);
                return;
        }
    }
}
