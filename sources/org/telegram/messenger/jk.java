package org.telegram.messenger;
public final class jk implements Runnable {
    public final int f20731a;
    public final TopicsController f20732b;
    public final long f20733c;

    public jk(TopicsController topicsController, long j10, int i9) {
        this.f20731a = i9;
        this.f20732b = topicsController;
        this.f20733c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20731a) {
            case 0:
                this.f20732b.lambda$loadTopics$6(this.f20733c);
                return;
            default:
                this.f20732b.lambda$processTopics$8(this.f20733c);
                return;
        }
    }
}
