package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f21461a;
    public final TopicsController f21462b;

    public uk(TopicsController topicsController, int i10) {
        this.f21461a = i10;
        this.f21462b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f21461a) {
            case 0:
                this.f21462b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f21462b.lambda$databaseCleared$25();
                return;
        }
    }
}
