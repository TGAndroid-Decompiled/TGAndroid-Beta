package org.telegram.messenger;
public final class f7 implements Runnable {
    public final int f18632a;
    public final MediaDataController f18633b;
    public final long f18634c;

    public f7(MediaDataController mediaDataController, long j10, int i10) {
        this.f18632a = i10;
        this.f18633b = mediaDataController;
        this.f18634c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18632a) {
            case 0:
                this.f18633b.lambda$loadPinnedMessages$161(this.f18634c);
                return;
            case 1:
                this.f18633b.lambda$increasePeerRaiting$157(this.f18634c);
                return;
            default:
                this.f18633b.lambda$clearBotKeyboard$194(this.f18634c);
                return;
        }
    }
}
