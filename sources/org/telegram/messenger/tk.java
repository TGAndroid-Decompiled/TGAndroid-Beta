package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17412a;
    public final TopicsController f17413b;
    public final long f17414c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f17412a = i10;
        this.f17413b = topicsController;
        this.f17414c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17412a) {
            case 0:
                this.f17413b.lambda$loadTopics$6(this.f17414c);
                return;
            default:
                this.f17413b.lambda$processTopics$8(this.f17414c);
                return;
        }
    }
}
