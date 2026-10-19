package org.telegram.messenger;
public final class pk implements Runnable {
    public final int f19299a;
    public final TopicsController f19300b;
    public final long f19301c;

    public pk(TopicsController topicsController, long j10, int i10) {
        this.f19299a = i10;
        this.f19300b = topicsController;
        this.f19301c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19299a) {
            case 0:
                this.f19300b.lambda$loadTopics$6(this.f19301c);
                return;
            default:
                this.f19300b.lambda$processTopics$8(this.f19301c);
                return;
        }
    }
}
