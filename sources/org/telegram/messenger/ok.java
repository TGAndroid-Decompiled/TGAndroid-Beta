package org.telegram.messenger;

public final class ok implements Runnable {

    public final int f21198a;

    public final TopicsController f21199b;

    public final long f21200c;

    public ok(TopicsController topicsController, long j10, int i10) {
        this.f21198a = i10;
        this.f21199b = topicsController;
        this.f21200c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21198a) {
            case 0:
                this.f21199b.lambda$loadTopics$6(this.f21200c);
                break;
            default:
                this.f21199b.lambda$processTopics$8(this.f21200c);
                break;
        }
    }
}
