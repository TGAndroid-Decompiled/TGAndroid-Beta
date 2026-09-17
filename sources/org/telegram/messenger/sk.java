package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19016a;
    public final TopicsController f19017b;
    public final long f19018c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19016a = i10;
        this.f19017b = topicsController;
        this.f19018c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19016a) {
            case 0:
                this.f19017b.lambda$loadTopics$6(this.f19018c);
                return;
            default:
                this.f19017b.lambda$processTopics$8(this.f19018c);
                return;
        }
    }
}
