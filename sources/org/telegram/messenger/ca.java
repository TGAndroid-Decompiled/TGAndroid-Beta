package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f16925a;
    public final MessagesController f16926b;
    public final long f16927c;
    public final int d;
    public final boolean e;
    public final int f16928f;
    public final int h;

    public ca(MessagesController messagesController, long j10, int i10, boolean z4, int i11, int i12, int i13) {
        this.f16925a = i13;
        this.f16926b = messagesController;
        this.f16927c = j10;
        this.d = i10;
        this.e = z4;
        this.f16928f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f16925a) {
            case 0:
                MessagesController.J(this.d, this.f16928f, this.h, this.f16927c, this.f16926b, this.e);
                return;
            default:
                MessagesController.q1(this.d, this.f16928f, this.h, this.f16927c, this.f16926b, this.e);
                return;
        }
    }
}
