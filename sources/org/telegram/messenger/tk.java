package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19139a;
    public final TopicsController f19140b;

    public tk(TopicsController topicsController, int i10) {
        this.f19139a = i10;
        this.f19140b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19139a) {
            case 0:
                this.f19140b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19140b.lambda$databaseCleared$25();
                return;
        }
    }
}
