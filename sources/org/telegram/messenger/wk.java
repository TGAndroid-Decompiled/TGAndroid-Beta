package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f18930a;
    public final TopicsController f18931b;

    public wk(TopicsController topicsController, int i10) {
        this.f18930a = i10;
        this.f18931b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f18930a) {
            case 0:
                this.f18931b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f18931b.lambda$databaseCleared$25();
                return;
        }
    }
}
