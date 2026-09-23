package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17400a;
    public final TopicsController f17401b;

    public tk(TopicsController topicsController, int i10) {
        this.f17400a = i10;
        this.f17401b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17400a) {
            case 0:
                this.f17401b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17401b.lambda$databaseCleared$25();
                return;
        }
    }
}
