package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19179a;
    public final TopicsController f19180b;
    public final long f19181c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19179a = i10;
        this.f19180b = topicsController;
        this.f19181c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19179a) {
            case 0:
                this.f19180b.lambda$loadTopics$6(this.f19181c);
                return;
            default:
                this.f19180b.lambda$processTopics$8(this.f19181c);
                return;
        }
    }
}
