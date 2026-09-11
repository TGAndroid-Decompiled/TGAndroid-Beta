package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19112a;
    public final TopicsController f19113b;

    public tk(TopicsController topicsController, int i10) {
        this.f19112a = i10;
        this.f19113b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19112a) {
            case 0:
                this.f19113b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19113b.lambda$databaseCleared$25();
                return;
        }
    }
}
