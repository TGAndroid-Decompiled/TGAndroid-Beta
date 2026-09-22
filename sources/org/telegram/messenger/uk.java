package org.telegram.messenger;
public final class uk implements Runnable {
    public final int f17490a;
    public final TopicsController f17491b;

    public uk(TopicsController topicsController, int i10) {
        this.f17490a = i10;
        this.f17491b = topicsController;
    }

    @Override
    public final void run() {
        switch (this.f17490a) {
            case 0:
                this.f17491b.lambda$applyPinnedOrder$17();
                return;
            default:
                this.f17491b.lambda$databaseCleared$25();
                return;
        }
    }
}
