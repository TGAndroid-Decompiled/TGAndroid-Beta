package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f17560a;
    public final TopicsController f17561b;
    public final long f17562c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f17560a = i10;
        this.f17561b = topicsController;
        this.f17562c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17560a) {
            case 0:
                this.f17561b.lambda$loadTopics$6(this.f17562c);
                return;
            default:
                this.f17561b.lambda$processTopics$8(this.f17562c);
                return;
        }
    }
}
