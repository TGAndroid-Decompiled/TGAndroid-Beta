package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17635a;
    public final TopicsController f17636b;
    public final long f17637c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f17635a = i10;
        this.f17636b = topicsController;
        this.f17637c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17635a) {
            case 0:
                this.f17636b.lambda$loadTopics$6(this.f17637c);
                return;
            default:
                this.f17636b.lambda$processTopics$8(this.f17637c);
                return;
        }
    }
}
