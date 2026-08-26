package org.telegram.messenger;

public final class TopicsController$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final TopicsController f$0;

    public TopicsController$$ExternalSyntheticLambda1(TopicsController topicsController, int i) {
        this.$r8$classId = i;
        this.f$0 = topicsController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$applyPinnedOrder$17();
                break;
            default:
                this.f$0.lambda$databaseCleared$25();
                break;
        }
    }
}
