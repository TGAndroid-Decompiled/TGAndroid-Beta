package org.telegram.messenger;
public final class ok implements Runnable {
    public final int f19219a;
    public final TopicsController f19220b;
    public final long f19221c;

    public ok(TopicsController topicsController, long j10, int i10) {
        this.f19219a = i10;
        this.f19220b = topicsController;
        this.f19221c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19219a) {
            case 0:
                this.f19220b.lambda$loadTopics$6(this.f19221c);
                return;
            default:
                this.f19220b.lambda$processTopics$8(this.f19221c);
                return;
        }
    }
}
