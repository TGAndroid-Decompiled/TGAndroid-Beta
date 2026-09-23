package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f17307a;
    public final TopicsController f17308b;
    public final long f17309c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f17307a = i10;
        this.f17308b = topicsController;
        this.f17309c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17307a) {
            case 0:
                this.f17308b.lambda$loadTopics$6(this.f17309c);
                return;
            default:
                this.f17308b.lambda$processTopics$8(this.f17309c);
                return;
        }
    }
}
