package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f19498a;
    public final TopicsController f19499b;
    public final long f19500c;

    public rk(TopicsController topicsController, long j10, int i10) {
        this.f19498a = i10;
        this.f19499b = topicsController;
        this.f19500c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19498a) {
            case 0:
                this.f19499b.lambda$loadTopics$6(this.f19500c);
                return;
            default:
                this.f19499b.lambda$processTopics$8(this.f19500c);
                return;
        }
    }
}
