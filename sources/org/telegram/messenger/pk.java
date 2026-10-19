package org.telegram.messenger;
public final class pk implements Runnable {
    public final int f19302a;
    public final TopicsController f19303b;

    public pk(TopicsController topicsController, int i10) {
        this.f19302a = i10;
        this.f19303b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19302a) {
            case 0:
                this.f19303b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19303b.lambda$databaseCleared$25();
                return;
        }
    }
}
