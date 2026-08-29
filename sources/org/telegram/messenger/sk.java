package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f21587a;
    public final TopicsController f21588b;

    public sk(TopicsController topicsController, int i10) {
        this.f21587a = i10;
        this.f21588b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f21587a) {
            case 0:
                this.f21588b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f21588b.lambda$databaseCleared$25();
                return;
        }
    }
}
