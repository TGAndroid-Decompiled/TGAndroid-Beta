package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f18722a;
    public final TopicsController f18723b;
    public final long f18724c;

    public vk(TopicsController topicsController, long j10, int i10) {
        this.f18722a = i10;
        this.f18723b = topicsController;
        this.f18724c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18722a) {
            case 0:
                this.f18723b.lambda$loadTopics$6(this.f18724c);
                return;
            default:
                this.f18723b.lambda$processTopics$8(this.f18724c);
                return;
        }
    }
}
