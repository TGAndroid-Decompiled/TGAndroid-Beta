package org.telegram.messenger;
public final class qk implements Runnable {
    public final int f19383a;
    public final TopicsController f19384b;

    public qk(TopicsController topicsController, int i10) {
        this.f19383a = i10;
        this.f19384b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19383a) {
            case 0:
                this.f19384b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19384b.lambda$databaseCleared$25();
                return;
        }
    }
}
