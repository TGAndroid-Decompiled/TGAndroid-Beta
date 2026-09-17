package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f17501a;
    public final TopicsController f17502b;

    public uk(TopicsController topicsController, int i10) {
        this.f17501a = i10;
        this.f17502b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17501a) {
            case 0:
                this.f17502b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17502b.lambda$databaseCleared$25();
                return;
        }
    }
}
