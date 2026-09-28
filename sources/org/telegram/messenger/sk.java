package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f17564a;
    public final TopicsController f17565b;
    public final long f17566c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f17564a = i10;
        this.f17565b = topicsController;
        this.f17566c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17564a) {
            case 0:
                this.f17565b.lambda$loadTopics$6(this.f17566c);
                return;
            default:
                this.f17565b.lambda$processTopics$8(this.f17566c);
                return;
        }
    }
}
