package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17663a;
    public final TopicsController f17664b;

    public tk(TopicsController topicsController, int i10) {
        this.f17663a = i10;
        this.f17664b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17663a) {
            case 0:
                this.f17664b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17664b.lambda$databaseCleared$25();
                return;
        }
    }
}
