package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f19538a;
    public final TopicsController f19539b;

    public rk(TopicsController topicsController, int i10) {
        this.f19538a = i10;
        this.f19539b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19538a) {
            case 0:
                this.f19539b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19539b.lambda$databaseCleared$25();
                return;
        }
    }
}
