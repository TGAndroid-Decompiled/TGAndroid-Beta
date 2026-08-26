package org.telegram.messenger.voip;

public final class VideoCapturerDevice$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId = 0;
    public final VideoCapturerDevice f$0;
    public final int f$1;
    public final long f$2;

    public VideoCapturerDevice$$ExternalSyntheticLambda1(VideoCapturerDevice videoCapturerDevice, int i, long j) {
        this.f$0 = videoCapturerDevice;
        this.f$1 = i;
        this.f$2 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onStateChanged$6(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$onStateChanged$7(this.f$2, this.f$1);
                break;
        }
    }

    public VideoCapturerDevice$$ExternalSyntheticLambda1(VideoCapturerDevice videoCapturerDevice, long j, int i) {
        this.f$0 = videoCapturerDevice;
        this.f$2 = j;
        this.f$1 = i;
    }
}
