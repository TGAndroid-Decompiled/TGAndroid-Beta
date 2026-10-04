package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19453a;
    public final VideoAds f19454b;

    public d(VideoAds videoAds, int i10) {
        this.f19453a = i10;
        this.f19454b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19453a) {
            case 0:
                VideoAds.r(this.f19454b);
                return;
            default:
                VideoAds.b(this.f19454b);
                return;
        }
    }
}
