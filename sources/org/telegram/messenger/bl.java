package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f14814a;
    public final TopicsController f14815b;
    public final long f14816c;

    public bl(TopicsController topicsController, long j3, int i10) {
        this.f14814a = i10;
        this.f14815b = topicsController;
        this.f14816c = j3;
    }

    @Override
    public final void run() {
        switch (this.f14814a) {
            case 0:
                this.f14815b.lambda$loadTopics$6(this.f14816c);
                return;
            default:
                this.f14815b.lambda$processTopics$8(this.f14816c);
                return;
        }
    }
}
