package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f19701a;
    public final MediaDataController f19702b;
    public final long f19703c;

    public w6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19701a = i10;
        this.f19702b = mediaDataController;
        this.f19703c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19701a) {
            case 0:
                this.f19702b.lambda$loadPinnedMessages$161(this.f19703c);
                return;
            case 1:
                this.f19702b.lambda$increasePeerRaiting$157(this.f19703c);
                return;
            default:
                this.f19702b.lambda$clearBotKeyboard$195(this.f19703c);
                return;
        }
    }
}
