package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f20573a;
    public final TopicsController f20574b;

    public wk(TopicsController topicsController, int i10) {
        this.f20573a = i10;
        this.f20574b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f20573a) {
            case 0:
                this.f20574b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f20574b.lambda$databaseCleared$25();
                return;
        }
    }
}
