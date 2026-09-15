package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f17416a;
    public final TopicsController f17417b;
    public final long f17418c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f17416a = i10;
        this.f17417b = topicsController;
        this.f17418c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17416a) {
            case 0:
                this.f17417b.lambda$loadTopics$6(this.f17418c);
                return;
            default:
                this.f17417b.lambda$processTopics$8(this.f17418c);
                return;
        }
    }
}
