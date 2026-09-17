package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19043a;
    public final TopicsController f19044b;
    public final long f19045c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19043a = i10;
        this.f19044b = topicsController;
        this.f19045c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19043a) {
            case 0:
                this.f19044b.lambda$loadTopics$6(this.f19045c);
                return;
            default:
                this.f19044b.lambda$processTopics$8(this.f19045c);
                return;
        }
    }
}
