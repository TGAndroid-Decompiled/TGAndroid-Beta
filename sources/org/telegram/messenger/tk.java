package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17598a;
    public final TopicsController f17599b;
    public final long f17600c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f17598a = i10;
        this.f17599b = topicsController;
        this.f17600c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17598a) {
            case 0:
                this.f17599b.lambda$loadTopics$6(this.f17600c);
                return;
            default:
                this.f17599b.lambda$processTopics$8(this.f17600c);
                return;
        }
    }
}
