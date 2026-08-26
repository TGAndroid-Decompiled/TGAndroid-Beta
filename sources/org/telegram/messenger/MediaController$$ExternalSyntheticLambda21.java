package org.telegram.messenger;

public final class MediaController$$ExternalSyntheticLambda21 implements Runnable {
    public final int $r8$classId;
    public final MediaController f$0;
    public final int f$1;

    public MediaController$$ExternalSyntheticLambda21(MediaController mediaController, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mediaController;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onAudioFocusChange$5(this.f$1);
                break;
            default:
                this.f$0.lambda$stopRecording$42(this.f$1);
                break;
        }
    }
}
