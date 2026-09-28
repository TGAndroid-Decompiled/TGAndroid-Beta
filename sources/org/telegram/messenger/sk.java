package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f17563a;
    public final TopicsController f17564b;
    public final long f17565c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f17563a = i10;
        this.f17564b = topicsController;
        this.f17565c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17563a) {
            case 0:
                this.f17564b.lambda$loadTopics$6(this.f17565c);
                return;
            default:
                this.f17564b.lambda$processTopics$8(this.f17565c);
                return;
        }
    }
}
