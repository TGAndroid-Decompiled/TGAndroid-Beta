package org.telegram.messenger;
public final class i7 implements Runnable {
    public final int f15431a;
    public final MediaDataController f15432b;
    public final long f15433c;

    public i7(MediaDataController mediaDataController, long j3, int i10) {
        this.f15431a = i10;
        this.f15432b = mediaDataController;
        this.f15433c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15431a) {
            case 0:
                this.f15432b.lambda$loadPinnedMessages$161(this.f15433c);
                return;
            case 1:
                this.f15432b.lambda$increasePeerRaiting$157(this.f15433c);
                return;
            default:
                this.f15432b.lambda$clearBotKeyboard$194(this.f15433c);
                return;
        }
    }
}
