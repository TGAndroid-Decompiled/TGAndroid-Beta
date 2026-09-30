package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f17580a;
    public final TopicsController f17581b;
    public final long f17582c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f17580a = i10;
        this.f17581b = topicsController;
        this.f17582c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17580a) {
            case 0:
                this.f17581b.lambda$loadTopics$6(this.f17582c);
                return;
            default:
                this.f17581b.lambda$processTopics$8(this.f17582c);
                return;
        }
    }
}
