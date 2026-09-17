package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19300a;
    public final VideoAds f19301b;

    public d(VideoAds videoAds, int i10) {
        this.f19300a = i10;
        this.f19301b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19300a) {
            case 0:
                VideoAds.b(this.f19301b);
                return;
            default:
                VideoAds.r(this.f19301b);
                return;
        }
    }
}
