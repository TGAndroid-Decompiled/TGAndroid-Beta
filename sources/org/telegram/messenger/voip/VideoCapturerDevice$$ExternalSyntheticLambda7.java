package org.telegram.messenger.voip;

public final class VideoCapturerDevice$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final VideoCapturerDevice f$0;

    public VideoCapturerDevice$$ExternalSyntheticLambda7(VideoCapturerDevice videoCapturerDevice, int i) {
        this.$r8$classId = i;
        this.f$0 = videoCapturerDevice;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDestroy$8();
                break;
            default:
                this.f$0.lambda$onDestroy$9();
                break;
        }
    }
}
