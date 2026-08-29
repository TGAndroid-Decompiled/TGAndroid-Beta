package org.telegram.messenger;
public final class ba implements Runnable {
    public final int f19794a;
    public final MessagesController f19795b;
    public final long f19796c;
    public final int d;
    public final boolean f19797e;
    public final int f19798f;
    public final int h;

    public ba(MessagesController messagesController, long j10, int i10, boolean z10, int i11, int i12, int i13) {
        this.f19794a = i13;
        this.f19795b = messagesController;
        this.f19796c = j10;
        this.d = i10;
        this.f19797e = z10;
        this.f19798f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f19794a) {
            case 0:
                MessagesController.J(this.d, this.f19798f, this.h, this.f19796c, this.f19795b, this.f19797e);
                return;
            default:
                MessagesController.q1(this.d, this.f19798f, this.h, this.f19796c, this.f19795b, this.f19797e);
                return;
        }
    }
}
