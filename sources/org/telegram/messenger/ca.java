package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f18346a;
    public final MessagesController f18347b;
    public final long f18348c;
    public final int d;
    public final boolean f18349e;
    public final int f18350f;
    public final int h;

    public ca(MessagesController messagesController, long j10, int i10, boolean z4, int i11, int i12, int i13) {
        this.f18346a = i13;
        this.f18347b = messagesController;
        this.f18348c = j10;
        this.d = i10;
        this.f18349e = z4;
        this.f18350f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        switch (this.f18346a) {
            case 0:
                MessagesController.J(this.d, this.f18350f, this.h, this.f18348c, this.f18347b, this.f18349e);
                return;
            default:
                MessagesController.q1(this.d, this.f18350f, this.h, this.f18348c, this.f18347b, this.f18349e);
                return;
        }
    }
}
