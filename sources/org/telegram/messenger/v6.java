package org.telegram.messenger;
public final class v6 implements Runnable {
    public final int f19387a;
    public final MediaDataController f19388b;
    public final long f19389c;

    public v6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19387a = i10;
        this.f19388b = mediaDataController;
        this.f19389c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19387a) {
            case 0:
                this.f19388b.lambda$loadPinnedMessages$161(this.f19389c);
                return;
            case 1:
                this.f19388b.lambda$increasePeerRaiting$157(this.f19389c);
                return;
            default:
                this.f19388b.lambda$clearBotKeyboard$195(this.f19389c);
                return;
        }
    }
}
