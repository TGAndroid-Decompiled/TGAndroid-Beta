package org.telegram.messenger;
public final class v6 implements Runnable {
    public final int f19393a;
    public final MediaDataController f19394b;
    public final long f19395c;

    public v6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19393a = i10;
        this.f19394b = mediaDataController;
        this.f19395c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19393a) {
            case 0:
                this.f19394b.lambda$loadPinnedMessages$161(this.f19395c);
                return;
            case 1:
                this.f19394b.lambda$increasePeerRaiting$157(this.f19395c);
                return;
            default:
                this.f19394b.lambda$clearBotKeyboard$195(this.f19395c);
                return;
        }
    }
}
