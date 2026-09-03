package org.telegram.messenger;
public final class f7 implements Runnable {
    public final int f18634a;
    public final MediaDataController f18635b;
    public final long f18636c;

    public f7(MediaDataController mediaDataController, long j10, int i10) {
        this.f18634a = i10;
        this.f18635b = mediaDataController;
        this.f18636c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18634a) {
            case 0:
                this.f18635b.lambda$loadPinnedMessages$161(this.f18636c);
                return;
            case 1:
                this.f18635b.lambda$increasePeerRaiting$157(this.f18636c);
                return;
            default:
                this.f18635b.lambda$clearBotKeyboard$194(this.f18636c);
                return;
        }
    }
}
