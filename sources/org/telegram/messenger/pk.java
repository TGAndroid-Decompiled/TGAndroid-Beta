package org.telegram.messenger;
public final class pk implements Runnable {
    public final int f19305a;
    public final TopicsController f19306b;

    public pk(TopicsController topicsController, int i10) {
        this.f19305a = i10;
        this.f19306b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19305a) {
            case 0:
                this.f19306b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19306b.lambda$databaseCleared$25();
                return;
        }
    }
}
