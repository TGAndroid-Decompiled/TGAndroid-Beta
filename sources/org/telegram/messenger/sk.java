package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19180a;
    public final TopicsController f19181b;
    public final long f19182c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19180a = i10;
        this.f19181b = topicsController;
        this.f19182c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19180a) {
            case 0:
                this.f19181b.lambda$loadTopics$6(this.f19182c);
                return;
            default:
                this.f19181b.lambda$processTopics$8(this.f19182c);
                return;
        }
    }
}
