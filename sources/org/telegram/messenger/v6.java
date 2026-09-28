package org.telegram.messenger;
public final class v6 implements Runnable {
    public final int f17749a;
    public final MediaDataController f17750b;
    public final long f17751c;

    public v6(MediaDataController mediaDataController, long j3, int i10) {
        this.f17749a = i10;
        this.f17750b = mediaDataController;
        this.f17751c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17749a) {
            case 0:
                this.f17750b.lambda$loadPinnedMessages$161(this.f17751c);
                return;
            case 1:
                this.f17750b.lambda$increasePeerRaiting$157(this.f17751c);
                return;
            default:
                this.f17750b.lambda$clearBotKeyboard$195(this.f17751c);
                return;
        }
    }
}
