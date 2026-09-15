package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f17492a;
    public final TopicsController f17493b;

    public uk(TopicsController topicsController, int i10) {
        this.f17492a = i10;
        this.f17493b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17492a) {
            case 0:
                this.f17493b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17493b.lambda$databaseCleared$25();
                return;
        }
    }
}
