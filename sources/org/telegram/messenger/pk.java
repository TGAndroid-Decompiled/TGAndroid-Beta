package org.telegram.messenger;
public final class pk implements Runnable {
    public final int f19303a;
    public final TopicsController f19304b;

    public pk(TopicsController topicsController, int i10) {
        this.f19303a = i10;
        this.f19304b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19303a) {
            case 0:
                this.f19304b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19304b.lambda$databaseCleared$25();
                return;
        }
    }
}
