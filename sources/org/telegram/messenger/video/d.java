package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19458a;
    public final VideoAds f19459b;

    public d(VideoAds videoAds, int i10) {
        this.f19458a = i10;
        this.f19459b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19458a) {
            case 0:
                VideoAds.r(this.f19459b);
                return;
            default:
                VideoAds.b(this.f19459b);
                return;
        }
    }
}
