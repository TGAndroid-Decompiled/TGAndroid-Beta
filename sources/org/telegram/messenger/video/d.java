package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f21544a;
    public final VideoAds f21545b;

    public d(VideoAds videoAds, int i10) {
        this.f21544a = i10;
        this.f21545b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f21544a) {
            case 0:
                VideoAds.r(this.f21545b);
                return;
            default:
                VideoAds.b(this.f21545b);
                return;
        }
    }
}
