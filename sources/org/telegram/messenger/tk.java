package org.telegram.messenger;
public final class tk implements Runnable {
    public final int f19127a;
    public final TopicsController f19128b;
    public final long f19129c;

    public tk(TopicsController topicsController, long j3, int i10) {
        this.f19127a = i10;
        this.f19128b = topicsController;
        this.f19129c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19127a) {
            case 0:
                this.f19128b.lambda$loadTopics$6(this.f19129c);
                return;
            default:
                this.f19128b.lambda$processTopics$8(this.f19129c);
                return;
        }
    }
}
