package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19279a;
    public final TopicsController f19280b;

    public tk(TopicsController topicsController, int i10) {
        this.f19279a = i10;
        this.f19280b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19279a) {
            case 0:
                this.f19280b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19280b.lambda$databaseCleared$25();
                return;
        }
    }
}
