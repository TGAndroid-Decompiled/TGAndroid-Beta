package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17632a;
    public final TopicsController f17633b;

    public tk(TopicsController topicsController, int i10) {
        this.f17632a = i10;
        this.f17633b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17632a) {
            case 0:
                this.f17633b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17633b.lambda$databaseCleared$25();
                return;
        }
    }
}
