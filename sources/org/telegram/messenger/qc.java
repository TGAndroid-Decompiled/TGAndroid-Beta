package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f18833a;
    public final MessagesController f18834b;
    public final int f18835c;
    public final long d;
    public final long f18836e;

    public qc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18833a = 2;
        this.f18834b = messagesController;
        this.d = j3;
        this.f18836e = j10;
        this.f18835c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18833a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f18836e;
                this.f18834b.lambda$sendTyping$173(this.f18835c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f18836e;
                this.f18834b.lambda$sendTyping$171(this.f18835c, j11, j12);
                return;
            default:
                long j13 = this.f18836e;
                int i10 = this.f18835c;
                this.f18834b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public qc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f18833a = i11;
        this.f18834b = messagesController;
        this.f18835c = i10;
        this.d = j3;
        this.f18836e = j10;
    }
}
