package org.telegram.messenger;
public final class vk implements Runnable {
    public final int f21590a;
    public final TopicsController f21591b;
    public final long f21592c;

    public vk(TopicsController topicsController, long j10, int i10) {
        this.f21590a = i10;
        this.f21591b = topicsController;
        this.f21592c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21590a) {
            case 0:
                this.f21591b.lambda$loadTopics$6(this.f21592c);
                return;
            default:
                this.f21591b.lambda$processTopics$8(this.f21592c);
                return;
        }
    }
}
