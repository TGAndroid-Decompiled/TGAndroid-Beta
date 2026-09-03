package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f20367a;
    public final TopicsController f20368b;
    public final long f20369c;

    public vk(TopicsController topicsController, long j10, int i10) {
        this.f20367a = i10;
        this.f20368b = topicsController;
        this.f20369c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20367a) {
            case 0:
                this.f20368b.lambda$loadTopics$6(this.f20369c);
                return;
            default:
                this.f20368b.lambda$processTopics$8(this.f20369c);
                return;
        }
    }
}
