package org.telegram.messenger;
public final class xk implements Runnable {
    public final int f18746a;
    public final TopicsController f18747b;

    public xk(TopicsController topicsController, int i10) {
        this.f18746a = i10;
        this.f18747b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f18746a) {
            case 0:
                this.f18747b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f18747b.lambda$databaseCleared$25();
                return;
        }
    }
}
