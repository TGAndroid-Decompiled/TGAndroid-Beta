package org.telegram.messenger;
public final class f7 implements Runnable {
    public final int f20054a;
    public final MediaDataController f20055b;
    public final long f20056c;

    public f7(MediaDataController mediaDataController, long j10, int i10) {
        this.f20054a = i10;
        this.f20055b = mediaDataController;
        this.f20056c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20054a) {
            case 0:
                this.f20055b.lambda$loadPinnedMessages$161(this.f20056c);
                return;
            case 1:
                this.f20055b.lambda$increasePeerRaiting$157(this.f20056c);
                return;
            default:
                this.f20055b.lambda$clearBotKeyboard$195(this.f20056c);
                return;
        }
    }
}
