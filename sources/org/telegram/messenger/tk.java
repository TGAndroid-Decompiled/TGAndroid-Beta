package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17641a;
    public final TopicsController f17642b;

    public tk(TopicsController topicsController, int i10) {
        this.f17641a = i10;
        this.f17642b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17641a) {
            case 0:
                this.f17642b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17642b.lambda$databaseCleared$25();
                return;
        }
    }
}
