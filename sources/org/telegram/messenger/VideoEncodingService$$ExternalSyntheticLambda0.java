package org.telegram.messenger;

public final class VideoEncodingService$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final VideoEncodingService f$0;

    public VideoEncodingService$$ExternalSyntheticLambda0(VideoEncodingService videoEncodingService, int i) {
        this.$r8$classId = i;
        this.f$0 = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$0();
                break;
            default:
                this.f$0.updateNotification();
                break;
        }
    }
}
