package org.telegram.messenger;
public final class qk implements Runnable {
    public final int f19394a;
    public final TopicsController f19395b;
    public final long f19396c;

    public qk(TopicsController topicsController, long j10, int i10) {
        this.f19394a = i10;
        this.f19395b = topicsController;
        this.f19396c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19394a) {
            case 0:
                this.f19395b.lambda$loadTopics$6(this.f19396c);
                return;
            default:
                this.f19395b.lambda$processTopics$8(this.f19396c);
                return;
        }
    }
}
