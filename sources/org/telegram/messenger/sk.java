package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19189a;
    public final TopicsController f19190b;
    public final long f19191c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19189a = i10;
        this.f19190b = topicsController;
        this.f19191c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19189a) {
            case 0:
                this.f19190b.lambda$loadTopics$6(this.f19191c);
                return;
            default:
                this.f19190b.lambda$processTopics$8(this.f19191c);
                return;
        }
    }
}
