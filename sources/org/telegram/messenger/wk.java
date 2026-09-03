package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f20575a;
    public final TopicsController f20576b;

    public wk(TopicsController topicsController, int i10) {
        this.f20575a = i10;
        this.f20576b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f20575a) {
            case 0:
                this.f20576b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f20576b.lambda$databaseCleared$25();
                return;
        }
    }
}
