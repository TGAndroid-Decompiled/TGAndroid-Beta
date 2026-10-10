package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19281a;
    public final TopicsController f19282b;

    public tk(TopicsController topicsController, int i10) {
        this.f19281a = i10;
        this.f19282b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19281a) {
            case 0:
                this.f19282b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19282b.lambda$databaseCleared$25();
                return;
        }
    }
}
