package org.telegram.messenger;
public final class ok implements Runnable {
    public final int f19222a;
    public final TopicsController f19223b;
    public final long f19224c;

    public ok(TopicsController topicsController, long j10, int i10) {
        this.f19222a = i10;
        this.f19223b = topicsController;
        this.f19224c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19222a) {
            case 0:
                this.f19223b.lambda$loadTopics$6(this.f19224c);
                return;
            default:
                this.f19223b.lambda$processTopics$8(this.f19224c);
                return;
        }
    }
}
