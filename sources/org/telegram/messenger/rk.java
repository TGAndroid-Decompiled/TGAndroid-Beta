package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f21474a;
    public final TopicsController f21475b;
    public final long f21476c;

    public rk(TopicsController topicsController, long j10, int i10) {
        this.f21474a = i10;
        this.f21475b = topicsController;
        this.f21476c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21474a) {
            case 0:
                this.f21475b.lambda$loadTopics$6(this.f21476c);
                return;
            default:
                this.f21475b.lambda$processTopics$8(this.f21476c);
                return;
        }
    }
}
