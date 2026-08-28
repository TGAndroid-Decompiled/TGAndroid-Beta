package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f21791a;
    public final VideoAds f21792b;

    public d(VideoAds videoAds, int i9) {
        this.f21791a = i9;
        this.f21792b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f21791a) {
            case 0:
                VideoAds.b(this.f21792b);
                return;
            default:
                VideoAds.r(this.f21792b);
                return;
        }
    }
}
