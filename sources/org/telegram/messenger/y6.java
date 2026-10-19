package org.telegram.messenger;
public final class y6 implements Runnable {
    public final int f20124a;
    public final MediaDataController f20125b;
    public final long f20126c;

    public y6(MediaDataController mediaDataController, long j10, int i10) {
        this.f20124a = i10;
        this.f20125b = mediaDataController;
        this.f20126c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20124a) {
            case 0:
                this.f20125b.lambda$loadPinnedMessages$161(this.f20126c);
                return;
            case 1:
                this.f20125b.lambda$increasePeerRaiting$157(this.f20126c);
                return;
            default:
                this.f20125b.lambda$clearBotKeyboard$195(this.f20126c);
                return;
        }
    }
}
