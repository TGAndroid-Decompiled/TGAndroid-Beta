package org.telegram.messenger;
public final class ok implements Runnable {
    public final int f19220a;
    public final TopicsController f19221b;
    public final long f19222c;

    public ok(TopicsController topicsController, long j10, int i10) {
        this.f19220a = i10;
        this.f19221b = topicsController;
        this.f19222c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19220a) {
            case 0:
                this.f19221b.lambda$loadTopics$6(this.f19222c);
                return;
            default:
                this.f19221b.lambda$processTopics$8(this.f19222c);
                return;
        }
    }
}
