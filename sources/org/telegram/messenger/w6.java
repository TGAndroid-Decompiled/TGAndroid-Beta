package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f19672a;
    public final MediaDataController f19673b;
    public final long f19674c;

    public w6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19672a = i10;
        this.f19673b = mediaDataController;
        this.f19674c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19672a) {
            case 0:
                this.f19673b.lambda$loadPinnedMessages$161(this.f19674c);
                return;
            case 1:
                this.f19673b.lambda$increasePeerRaiting$157(this.f19674c);
                return;
            default:
                this.f19673b.lambda$clearBotKeyboard$195(this.f19674c);
                return;
        }
    }
}
