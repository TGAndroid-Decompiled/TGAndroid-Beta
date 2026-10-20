package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f19476a;
    public final TopicsController f19477b;

    public rk(TopicsController topicsController, int i10) {
        this.f19476a = i10;
        this.f19477b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19476a) {
            case 0:
                this.f19477b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19477b.lambda$databaseCleared$25();
                return;
        }
    }
}
