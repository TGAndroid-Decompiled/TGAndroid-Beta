package org.telegram.messenger;
public final class w6 implements Runnable {
    public final int f19668a;
    public final MediaDataController f19669b;
    public final long f19670c;

    public w6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19668a = i10;
        this.f19669b = mediaDataController;
        this.f19670c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19668a) {
            case 0:
                this.f19669b.lambda$loadPinnedMessages$161(this.f19670c);
                return;
            case 1:
                this.f19669b.lambda$increasePeerRaiting$157(this.f19670c);
                return;
            default:
                this.f19669b.lambda$clearBotKeyboard$195(this.f19670c);
                return;
        }
    }
}
