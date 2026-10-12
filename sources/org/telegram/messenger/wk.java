package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f18956a;
    public final TopicsController f18957b;

    public wk(TopicsController topicsController, int i10) {
        this.f18956a = i10;
        this.f18957b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f18956a) {
            case 0:
                this.f18957b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f18957b.lambda$databaseCleared$25();
                return;
        }
    }
}
