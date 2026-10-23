package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19558a;
    public final TopicsController f19559b;

    public sk(TopicsController topicsController, int i10) {
        this.f19558a = i10;
        this.f19559b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f19558a) {
            case 0:
                this.f19559b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f19559b.lambda$databaseCleared$25();
                return;
        }
    }
}
