package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17425a;
    public final TopicsController f17426b;
    public final long f17427c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f17425a = i10;
        this.f17426b = topicsController;
        this.f17427c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17425a) {
            case 0:
                this.f17426b.lambda$loadTopics$6(this.f17427c);
                return;
            default:
                this.f17426b.lambda$processTopics$8(this.f17427c);
                return;
        }
    }
}
