package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f19665a;
    public final MediaDataController f19666b;
    public final long f19667c;

    public w6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19665a = i10;
        this.f19666b = mediaDataController;
        this.f19667c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19665a) {
            case 0:
                this.f19666b.lambda$loadPinnedMessages$161(this.f19667c);
                return;
            case 1:
                this.f19666b.lambda$increasePeerRaiting$157(this.f19667c);
                return;
            default:
                this.f19666b.lambda$clearBotKeyboard$195(this.f19667c);
                return;
        }
    }
}
