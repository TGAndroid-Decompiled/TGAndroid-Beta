package org.telegram.messenger;
public final class v6 implements Runnable {
    public final int f17765a;
    public final MediaDataController f17766b;
    public final long f17767c;

    public v6(MediaDataController mediaDataController, long j3, int i10) {
        this.f17765a = i10;
        this.f17766b = mediaDataController;
        this.f17767c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17765a) {
            case 0:
                this.f17766b.lambda$loadPinnedMessages$161(this.f17767c);
                return;
            case 1:
                this.f17766b.lambda$increasePeerRaiting$157(this.f17767c);
                return;
            default:
                this.f17766b.lambda$clearBotKeyboard$195(this.f17767c);
                return;
        }
    }
}
