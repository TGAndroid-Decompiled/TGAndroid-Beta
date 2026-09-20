package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f17706a;
    public final TopicsController f17707b;

    public uk(TopicsController topicsController, int i10) {
        this.f17706a = i10;
        this.f17707b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17706a) {
            case 0:
                this.f17707b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17707b.lambda$databaseCleared$25();
                return;
        }
    }
}
