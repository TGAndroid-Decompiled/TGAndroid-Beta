package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f17554a;
    public final TopicsController f17555b;
    public final long f17556c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f17554a = i10;
        this.f17555b = topicsController;
        this.f17556c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17554a) {
            case 0:
                this.f17555b.lambda$loadTopics$6(this.f17556c);
                return;
            default:
                this.f17555b.lambda$processTopics$8(this.f17556c);
                return;
        }
    }
}
