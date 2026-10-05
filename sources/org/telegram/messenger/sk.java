package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19184a;
    public final TopicsController f19185b;
    public final long f19186c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19184a = i10;
        this.f19185b = topicsController;
        this.f19186c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19184a) {
            case 0:
                this.f19185b.lambda$loadTopics$6(this.f19186c);
                return;
            default:
                this.f19185b.lambda$processTopics$8(this.f19186c);
                return;
        }
    }
}
