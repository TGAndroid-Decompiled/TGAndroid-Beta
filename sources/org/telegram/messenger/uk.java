package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f19184a;
    public final TopicsController f19185b;

    public uk(TopicsController topicsController, int i10) {
        this.f19184a = i10;
        this.f19185b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19184a) {
            case 0:
                this.f19185b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19185b.lambda$databaseCleared$25();
                return;
        }
    }
}
