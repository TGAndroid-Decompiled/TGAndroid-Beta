package org.telegram.messenger;
public final class v6 implements Runnable {
    public final int f17748a;
    public final MediaDataController f17749b;
    public final long f17750c;

    public v6(MediaDataController mediaDataController, long j3, int i10) {
        this.f17748a = i10;
        this.f17749b = mediaDataController;
        this.f17750c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17748a) {
            case 0:
                this.f17749b.lambda$loadPinnedMessages$161(this.f17750c);
                return;
            case 1:
                this.f17749b.lambda$increasePeerRaiting$157(this.f17750c);
                return;
            default:
                this.f17749b.lambda$clearBotKeyboard$195(this.f17750c);
                return;
        }
    }
}
