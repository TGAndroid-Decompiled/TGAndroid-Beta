package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17647a;
    public final TopicsController f17648b;

    public tk(TopicsController topicsController, int i10) {
        this.f17647a = i10;
        this.f17648b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17647a) {
            case 0:
                this.f17648b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17648b.lambda$databaseCleared$25();
                return;
        }
    }
}
