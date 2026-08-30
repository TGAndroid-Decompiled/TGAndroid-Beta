package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f18740a;
    public final TopicsController f18741b;
    public final long f18742c;

    public vk(TopicsController topicsController, long j10, int i10) {
        this.f18740a = i10;
        this.f18741b = topicsController;
        this.f18742c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18740a) {
            case 0:
                this.f18741b.lambda$loadTopics$6(this.f18742c);
                return;
            default:
                this.f18741b.lambda$processTopics$8(this.f18742c);
                return;
        }
    }
}
