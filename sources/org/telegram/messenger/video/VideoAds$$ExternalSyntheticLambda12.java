package org.telegram.messenger.video;

public final class VideoAds$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final VideoAds f$0;

    public VideoAds$$ExternalSyntheticLambda12(VideoAds videoAds, int i) {
        this.$r8$classId = i;
        this.f$0 = videoAds;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.show();
                break;
            default:
                this.f$0.showPremium();
                break;
        }
    }
}
