package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f19211a;
    public final TopicsController f19212b;

    public uk(TopicsController topicsController, int i10) {
        this.f19211a = i10;
        this.f19212b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19211a) {
            case 0:
                this.f19212b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19212b.lambda$databaseCleared$25();
                return;
        }
    }
}
