package org.telegram.messenger;
public final class v6 implements Runnable {
    public final int f19388a;
    public final MediaDataController f19389b;
    public final long f19390c;

    public v6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19388a = i10;
        this.f19389b = mediaDataController;
        this.f19390c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19388a) {
            case 0:
                this.f19389b.lambda$loadPinnedMessages$161(this.f19390c);
                return;
            case 1:
                this.f19389b.lambda$increasePeerRaiting$157(this.f19390c);
                return;
            default:
                this.f19389b.lambda$clearBotKeyboard$195(this.f19390c);
                return;
        }
    }
}
