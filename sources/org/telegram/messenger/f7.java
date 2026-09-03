package org.telegram.messenger;
public final class f7 implements Runnable {
    public final int f17170a;
    public final MediaDataController f17171b;
    public final long f17172c;

    public f7(MediaDataController mediaDataController, long j10, int i10) {
        this.f17170a = i10;
        this.f17171b = mediaDataController;
        this.f17172c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17170a) {
            case 0:
                this.f17171b.lambda$loadPinnedMessages$161(this.f17172c);
                return;
            case 1:
                this.f17171b.lambda$increasePeerRaiting$157(this.f17172c);
                return;
            default:
                this.f17171b.lambda$clearBotKeyboard$194(this.f17172c);
                return;
        }
    }
}
