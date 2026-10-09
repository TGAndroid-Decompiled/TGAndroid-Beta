package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19277a;
    public final TopicsController f19278b;

    public tk(TopicsController topicsController, int i10) {
        this.f19277a = i10;
        this.f19278b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19277a) {
            case 0:
                this.f19278b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19278b.lambda$databaseCleared$25();
                return;
        }
    }
}
