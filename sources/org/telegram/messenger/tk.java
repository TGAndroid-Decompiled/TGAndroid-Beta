package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17650a;
    public final TopicsController f17651b;
    public final long f17652c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f17650a = i10;
        this.f17651b = topicsController;
        this.f17652c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17650a) {
            case 0:
                this.f17651b.lambda$loadTopics$6(this.f17652c);
                return;
            default:
                this.f17651b.lambda$processTopics$8(this.f17652c);
                return;
        }
    }
}
