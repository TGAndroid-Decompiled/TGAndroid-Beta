package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f16002a;
    public final MediaDataController f16003b;
    public final long f16004c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f16002a = i10;
        this.f16003b = mediaDataController;
        this.f16004c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16002a) {
            case 0:
                this.f16003b.lambda$loadPinnedMessages$161(this.f16004c);
                return;
            case 1:
                this.f16003b.lambda$increasePeerRaiting$157(this.f16004c);
                return;
            default:
                this.f16003b.lambda$clearBotKeyboard$194(this.f16004c);
                return;
        }
    }
}
