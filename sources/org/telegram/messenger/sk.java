package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f17545a;
    public final TopicsController f17546b;
    public final long f17547c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f17545a = i10;
        this.f17546b = topicsController;
        this.f17547c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17545a) {
            case 0:
                this.f17546b.lambda$loadTopics$6(this.f17547c);
                return;
            default:
                this.f17546b.lambda$processTopics$8(this.f17547c);
                return;
        }
    }
}
