package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f21367a;
    public final TopicsController f21368b;
    public final long f21369c;

    public tk(TopicsController topicsController, long j10, int i10) {
        this.f21367a = i10;
        this.f21368b = topicsController;
        this.f21369c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21367a) {
            case 0:
                this.f21368b.lambda$loadTopics$6(this.f21369c);
                return;
            default:
                this.f21368b.lambda$processTopics$8(this.f21369c);
                return;
        }
    }
}
