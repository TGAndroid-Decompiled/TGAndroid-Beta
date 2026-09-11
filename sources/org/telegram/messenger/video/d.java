package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19273a;
    public final VideoAds f19274b;

    public d(VideoAds videoAds, int i10) {
        this.f19273a = i10;
        this.f19274b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19273a) {
            case 0:
                VideoAds.b(this.f19274b);
                return;
            default:
                VideoAds.r(this.f19274b);
                return;
        }
    }
}
