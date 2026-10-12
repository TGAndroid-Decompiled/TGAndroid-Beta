package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f18757a;
    public final TopicsController f18758b;
    public final long f18759c;

    public vk(TopicsController topicsController, long j10, int i10) {
        this.f18757a = i10;
        this.f18758b = topicsController;
        this.f18759c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18757a) {
            case 0:
                this.f18758b.lambda$loadTopics$6(this.f18759c);
                return;
            default:
                this.f18758b.lambda$processTopics$8(this.f18759c);
                return;
        }
    }
}
