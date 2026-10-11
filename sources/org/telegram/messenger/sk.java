package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19191a;
    public final TopicsController f19192b;
    public final long f19193c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19191a = i10;
        this.f19192b = topicsController;
        this.f19193c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19191a) {
            case 0:
                this.f19192b.lambda$loadTopics$6(this.f19193c);
                return;
            default:
                this.f19192b.lambda$processTopics$8(this.f19193c);
                return;
        }
    }
}
