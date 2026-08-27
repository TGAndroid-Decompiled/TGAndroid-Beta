package org.telegram.messenger;

public final class pk implements Runnable {

    public final int f21299a;

    public final TopicsController f21300b;

    public pk(TopicsController topicsController, int i10) {
        this.f21299a = i10;
        this.f21300b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f21299a) {
            case 0:
                this.f21300b.lambda$applyPinnedOrder$17();
                break;
            default:
                this.f21300b.lambda$databaseCleared$25();
                break;
        }
    }
}
