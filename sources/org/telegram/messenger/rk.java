package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f19469a;
    public final TopicsController f19470b;
    public final long f19471c;

    public rk(TopicsController topicsController, long j10, int i10) {
        this.f19469a = i10;
        this.f19470b = topicsController;
        this.f19471c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19469a) {
            case 0:
                this.f19470b.lambda$loadTopics$6(this.f19471c);
                return;
            default:
                this.f19470b.lambda$processTopics$8(this.f19471c);
                return;
        }
    }
}
