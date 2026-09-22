package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f17721a;
    public final TopicsController f17722b;

    public uk(TopicsController topicsController, int i10) {
        this.f17721a = i10;
        this.f17722b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17721a) {
            case 0:
                this.f17722b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17722b.lambda$databaseCleared$25();
                return;
        }
    }
}
