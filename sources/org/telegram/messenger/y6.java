package org.telegram.messenger;
public final class y6 implements Runnable {
    public final int f20122a;
    public final MediaDataController f20123b;
    public final long f20124c;

    public y6(MediaDataController mediaDataController, long j10, int i10) {
        this.f20122a = i10;
        this.f20123b = mediaDataController;
        this.f20124c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20122a) {
            case 0:
                this.f20123b.lambda$loadPinnedMessages$161(this.f20124c);
                return;
            case 1:
                this.f20123b.lambda$increasePeerRaiting$157(this.f20124c);
                return;
            default:
                this.f20123b.lambda$clearBotKeyboard$195(this.f20124c);
                return;
        }
    }
}
