package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19274a;
    public final TopicsController f19275b;

    public tk(TopicsController topicsController, int i10) {
        this.f19274a = i10;
        this.f19275b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19274a) {
            case 0:
                this.f19275b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19275b.lambda$databaseCleared$25();
                return;
        }
    }
}
