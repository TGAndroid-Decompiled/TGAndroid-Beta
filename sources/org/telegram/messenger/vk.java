package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f20365a;
    public final TopicsController f20366b;
    public final long f20367c;

    public vk(TopicsController topicsController, long j10, int i10) {
        this.f20365a = i10;
        this.f20366b = topicsController;
        this.f20367c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20365a) {
            case 0:
                this.f20366b.lambda$loadTopics$6(this.f20367c);
                return;
            default:
                this.f20366b.lambda$processTopics$8(this.f20367c);
                return;
        }
    }
}
