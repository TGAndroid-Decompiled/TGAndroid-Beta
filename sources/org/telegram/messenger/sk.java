package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19612a;
    public final TopicsController f19613b;

    public sk(TopicsController topicsController, int i10) {
        this.f19612a = i10;
        this.f19613b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19612a) {
            case 0:
                this.f19613b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19613b.lambda$databaseCleared$25();
                return;
        }
    }
}
