package org.telegram.messenger;
public final class wk implements Runnable {
    public final int f18656a;
    public final TopicsController f18657b;
    public final long f18658c;

    public wk(TopicsController topicsController, long j10, int i10) {
        this.f18656a = i10;
        this.f18657b = topicsController;
        this.f18658c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18656a) {
            case 0:
                this.f18657b.lambda$loadTopics$6(this.f18658c);
                return;
            default:
                this.f18657b.lambda$processTopics$8(this.f18658c);
                return;
        }
    }
}
