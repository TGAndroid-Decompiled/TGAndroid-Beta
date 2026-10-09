package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19457a;
    public final VideoAds f19458b;

    public d(VideoAds videoAds, int i10) {
        this.f19457a = i10;
        this.f19458b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19457a) {
            case 0:
                VideoAds.r(this.f19458b);
                return;
            default:
                VideoAds.b(this.f19458b);
                return;
        }
    }
}
