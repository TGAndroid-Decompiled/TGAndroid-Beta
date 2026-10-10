package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19461a;
    public final VideoAds f19462b;

    public d(VideoAds videoAds, int i10) {
        this.f19461a = i10;
        this.f19462b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19461a) {
            case 0:
                VideoAds.r(this.f19462b);
                return;
            default:
                VideoAds.b(this.f19462b);
                return;
        }
    }
}
