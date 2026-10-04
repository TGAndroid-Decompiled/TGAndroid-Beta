package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19275a;
    public final TopicsController f19276b;

    public tk(TopicsController topicsController, int i10) {
        this.f19275a = i10;
        this.f19276b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19275a) {
            case 0:
                this.f19276b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19276b.lambda$databaseCleared$25();
                return;
        }
    }
}
