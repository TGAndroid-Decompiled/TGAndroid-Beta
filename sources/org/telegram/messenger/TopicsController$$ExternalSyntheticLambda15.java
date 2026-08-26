package org.telegram.messenger;

public final class TopicsController$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId;
    public final TopicsController f$0;
    public final long f$1;

    public TopicsController$$ExternalSyntheticLambda15(TopicsController topicsController, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = topicsController;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadTopics$6(this.f$1);
                break;
            default:
                this.f$0.lambda$processTopics$8(this.f$1);
                break;
        }
    }
}
