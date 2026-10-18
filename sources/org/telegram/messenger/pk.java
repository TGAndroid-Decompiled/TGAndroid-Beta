package org.telegram.messenger;
public final class pk implements Runnable {
    public final int f19296a;
    public final TopicsController f19297b;
    public final long f19298c;

    public pk(TopicsController topicsController, long j10, int i10) {
        this.f19296a = i10;
        this.f19297b = topicsController;
        this.f19298c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19296a) {
            case 0:
                this.f19297b.lambda$loadTopics$6(this.f19298c);
                return;
            default:
                this.f19297b.lambda$processTopics$8(this.f19298c);
                return;
        }
    }
}
