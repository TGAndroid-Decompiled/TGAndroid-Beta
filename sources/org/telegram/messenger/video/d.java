package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f21558a;
    public final VideoAds f21559b;

    public d(VideoAds videoAds, int i10) {
        this.f21558a = i10;
        this.f21559b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f21558a) {
            case 0:
                VideoAds.r(this.f21559b);
                return;
            default:
                VideoAds.b(this.f21559b);
                return;
        }
    }
}
