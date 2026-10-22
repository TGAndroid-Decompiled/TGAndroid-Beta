package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19634a;
    public final TopicsController f19635b;

    public tk(TopicsController topicsController, int i10) {
        this.f19634a = i10;
        this.f19635b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19634a) {
            case 0:
                this.f19635b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19635b.lambda$databaseCleared$25();
                return;
        }
    }
}
