package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19227a;
    public final TopicsController f19228b;
    public final long f19229c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19227a = i10;
        this.f19228b = topicsController;
        this.f19229c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19227a) {
            case 0:
                this.f19228b.lambda$loadTopics$6(this.f19229c);
                return;
            default:
                this.f19228b.lambda$processTopics$8(this.f19229c);
                return;
        }
    }
}
