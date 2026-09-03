package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f18348a;
    public final MessagesController f18349b;
    public final long f18350c;
    public final int d;
    public final boolean f18351e;
    public final int f18352f;
    public final int h;

    public ca(MessagesController messagesController, long j10, int i10, boolean z4, int i11, int i12, int i13) {
        this.f18348a = i13;
        this.f18349b = messagesController;
        this.f18350c = j10;
        this.d = i10;
        this.f18351e = z4;
        this.f18352f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18348a) {
            case 0:
                MessagesController.J(this.d, this.f18352f, this.h, this.f18350c, this.f18349b, this.f18351e);
                return;
            default:
                MessagesController.q1(this.d, this.f18352f, this.h, this.f18350c, this.f18349b, this.f18351e);
                return;
        }
    }
}
