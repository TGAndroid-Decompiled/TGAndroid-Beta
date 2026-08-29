package org.telegram.messenger;
public final class e7 implements Runnable {
    public final int f20099a;
    public final MediaDataController f20100b;
    public final long f20101c;

    public e7(MediaDataController mediaDataController, long j10, int i10) {
        this.f20099a = i10;
        this.f20100b = mediaDataController;
        this.f20101c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20099a) {
            case 0:
                this.f20100b.lambda$loadPinnedMessages$161(this.f20101c);
                return;
            case 1:
                this.f20100b.lambda$increasePeerRaiting$157(this.f20101c);
                return;
            default:
                this.f20100b.lambda$clearBotKeyboard$194(this.f20101c);
                return;
        }
    }
}
