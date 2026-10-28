package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f21793a;
    public final TopicsController f21794b;

    public wk(TopicsController topicsController, int i10) {
        this.f21793a = i10;
        this.f21794b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f21793a) {
            case 0:
                this.f21794b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f21794b.lambda$databaseCleared$25();
                return;
        }
    }
}
