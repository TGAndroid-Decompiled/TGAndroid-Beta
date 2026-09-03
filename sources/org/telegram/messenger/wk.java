package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f18912a;
    public final TopicsController f18913b;

    public wk(TopicsController topicsController, int i10) {
        this.f18912a = i10;
        this.f18913b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f18912a) {
            case 0:
                this.f18913b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f18913b.lambda$databaseCleared$25();
                return;
        }
    }
}
