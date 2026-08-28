package org.telegram.messenger;
public final class kk implements Runnable {
    public final int f20824a;
    public final TopicsController f20825b;

    public kk(TopicsController topicsController, int i9) {
        this.f20824a = i9;
        this.f20825b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f20824a) {
            case 0:
                this.f20825b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f20825b.lambda$databaseCleared$25();
                return;
        }
    }
}
