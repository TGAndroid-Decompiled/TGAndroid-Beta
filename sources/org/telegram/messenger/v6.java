package org.telegram.messenger;
public final class v6 implements Runnable {
    public final int f19386a;
    public final MediaDataController f19387b;
    public final long f19388c;

    public v6(MediaDataController mediaDataController, long j3, int i10) {
        this.f19386a = i10;
        this.f19387b = mediaDataController;
        this.f19388c = j3;
    }

    @Override
    public final void run() {
        switch (this.f19386a) {
            case 0:
                this.f19387b.lambda$loadPinnedMessages$161(this.f19388c);
                return;
            case 1:
                this.f19387b.lambda$increasePeerRaiting$157(this.f19388c);
                return;
            default:
                this.f19387b.lambda$clearBotKeyboard$195(this.f19388c);
                return;
        }
    }
}
