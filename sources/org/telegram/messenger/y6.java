package org.telegram.messenger;
public final class y6 implements Runnable {
    public final int f20130a;
    public final MediaDataController f20131b;
    public final long f20132c;

    public y6(MediaDataController mediaDataController, long j10, int i10) {
        this.f20130a = i10;
        this.f20131b = mediaDataController;
        this.f20132c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20130a) {
            case 0:
                this.f20131b.lambda$loadPinnedMessages$161(this.f20132c);
                return;
            case 1:
                this.f20131b.lambda$increasePeerRaiting$157(this.f20132c);
                return;
            default:
                this.f20131b.lambda$clearBotKeyboard$195(this.f20132c);
                return;
        }
    }
}
