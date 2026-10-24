package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19859a;
    public final VideoAds f19860b;

    public d(VideoAds videoAds, int i10) {
        this.f19859a = i10;
        this.f19860b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19859a) {
            case 0:
                VideoAds.r(this.f19860b);
                return;
            default:
                VideoAds.b(this.f19860b);
                return;
        }
    }
}
