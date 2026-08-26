package org.telegram.messenger;

public final class MediaDataController$$ExternalSyntheticLambda60 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final long f$1;

    public MediaDataController$$ExternalSyntheticLambda60(MediaDataController mediaDataController, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaDataController;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$clearBotKeyboard$194(this.f$1);
                break;
            case 1:
                this.f$0.lambda$loadPinnedMessages$161(this.f$1);
                break;
            default:
                this.f$0.lambda$increasePeerRaiting$157(this.f$1);
                break;
        }
    }
}
