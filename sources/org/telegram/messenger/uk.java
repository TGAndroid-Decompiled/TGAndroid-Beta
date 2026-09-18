package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f17674a;
    public final TopicsController f17675b;

    public uk(TopicsController topicsController, int i10) {
        this.f17674a = i10;
        this.f17675b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17674a) {
            case 0:
                this.f17675b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17675b.lambda$databaseCleared$25();
                return;
        }
    }
}
