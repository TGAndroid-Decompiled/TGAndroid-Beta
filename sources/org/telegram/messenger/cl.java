package org.telegram.messenger;
public final class cl implements Runnable {
    public final int f14946a;
    public final TopicsController f14947b;

    public cl(TopicsController topicsController, int i10) {
        this.f14946a = i10;
        this.f14947b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f14946a) {
            case 0:
                this.f14947b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f14947b.lambda$databaseCleared$25();
                return;
        }
    }
}
