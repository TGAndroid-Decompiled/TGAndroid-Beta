package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17646a;
    public final TopicsController f17647b;

    public tk(TopicsController topicsController, int i10) {
        this.f17646a = i10;
        this.f17647b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17646a) {
            case 0:
                this.f17647b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17647b.lambda$databaseCleared$25();
                return;
        }
    }
}
