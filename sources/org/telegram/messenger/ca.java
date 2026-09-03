package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f16910a;
    public final MessagesController f16911b;
    public final long f16912c;
    public final int d;
    public final boolean e;
    public final int f16913f;
    public final int h;

    public ca(MessagesController messagesController, long j10, int i10, boolean z4, int i11, int i12, int i13) {
        this.f16910a = i13;
        this.f16911b = messagesController;
        this.f16912c = j10;
        this.d = i10;
        this.e = z4;
        this.f16913f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f16910a) {
            case 0:
                MessagesController.J(this.d, this.f16913f, this.h, this.f16912c, this.f16911b, this.e);
                return;
            default:
                MessagesController.q1(this.d, this.f16913f, this.h, this.f16912c, this.f16911b, this.e);
                return;
        }
    }
}
