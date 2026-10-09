package org.telegram.messenger;
public final class sk implements Runnable {
    public final int f19185a;
    public final TopicsController f19186b;
    public final long f19187c;

    public sk(TopicsController topicsController, long j3, int i10) {
        this.f19185a = i10;
        this.f19186b = topicsController;
        this.f19187c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19185a) {
            case 0:
                this.f19186b.lambda$loadTopics$6(this.f19187c);
                return;
            default:
                this.f19186b.lambda$processTopics$8(this.f19187c);
                return;
        }
    }
}
