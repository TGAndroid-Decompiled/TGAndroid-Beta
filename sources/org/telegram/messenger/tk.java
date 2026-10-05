package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19286a;
    public final TopicsController f19287b;

    public tk(TopicsController topicsController, int i10) {
        this.f19286a = i10;
        this.f19287b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19286a) {
            case 0:
                this.f19287b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19287b.lambda$databaseCleared$25();
                return;
        }
    }
}
