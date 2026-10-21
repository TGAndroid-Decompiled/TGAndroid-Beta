package org.telegram.messenger;
public final class qk implements Runnable {
    public final int f19391a;
    public final TopicsController f19392b;
    public final long f19393c;

    public qk(TopicsController topicsController, long j10, int i10) {
        this.f19391a = i10;
        this.f19392b = topicsController;
        this.f19393c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19391a) {
            case 0:
                this.f19392b.lambda$loadTopics$6(this.f19393c);
                return;
            default:
                this.f19392b.lambda$processTopics$8(this.f19393c);
                return;
        }
    }
}
