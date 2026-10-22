package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19543a;
    public final TopicsController f19544b;
    public final long f19545c;

    public sk(TopicsController topicsController, long j10, int i10) {
        this.f19543a = i10;
        this.f19544b = topicsController;
        this.f19545c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19543a) {
            case 0:
                TopicsController.o(this.f19544b, this.f19545c);
                return;
            default:
                TopicsController.y(this.f19544b, this.f19545c);
                return;
        }
    }
}
