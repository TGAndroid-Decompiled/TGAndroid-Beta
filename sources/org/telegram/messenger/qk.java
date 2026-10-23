package org.telegram.messenger;
public final class qk implements Runnable {
    public final int f19426a;
    public final TopicsController f19427b;
    public final long f19428c;

    public qk(TopicsController topicsController, long j10, int i10) {
        this.f19426a = i10;
        this.f19427b = topicsController;
        this.f19428c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19426a) {
            case 0:
                this.f19427b.lambda$loadTopics$6(this.f19428c);
                return;
            default:
                this.f19427b.lambda$processTopics$8(this.f19428c);
                return;
        }
    }
}
