package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f19473a;
    public final TopicsController f19474b;

    public rk(TopicsController topicsController, int i10) {
        this.f19473a = i10;
        this.f19474b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19473a) {
            case 0:
                this.f19474b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19474b.lambda$databaseCleared$25();
                return;
        }
    }
}
