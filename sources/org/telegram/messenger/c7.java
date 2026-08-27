package org.telegram.messenger;

public final class c7 implements Runnable {

    public final int f19889a;

    public final MediaDataController f19890b;

    public final long f19891c;

    public c7(MediaDataController mediaDataController, long j10, int i10) {
        this.f19889a = i10;
        this.f19890b = mediaDataController;
        this.f19891c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19889a) {
            case 0:
                this.f19890b.lambda$loadPinnedMessages$161(this.f19891c);
                break;
            case 1:
                this.f19890b.lambda$increasePeerRaiting$157(this.f19891c);
                break;
            default:
                this.f19890b.lambda$clearBotKeyboard$194(this.f19891c);
                break;
        }
    }
}
