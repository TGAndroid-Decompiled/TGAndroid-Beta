package org.telegram.messenger;
public final class qk implements Runnable {
    public final int f19386a;
    public final TopicsController f19387b;

    public qk(TopicsController topicsController, int i10) {
        this.f19386a = i10;
        this.f19387b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19386a) {
            case 0:
                this.f19387b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19387b.lambda$databaseCleared$25();
                return;
        }
    }
}
