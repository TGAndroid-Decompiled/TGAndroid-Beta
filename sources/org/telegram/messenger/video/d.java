package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19451a;
    public final VideoAds f19452b;

    public d(VideoAds videoAds, int i10) {
        this.f19451a = i10;
        this.f19452b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19451a) {
            case 0:
                VideoAds.r(this.f19452b);
                return;
            default:
                VideoAds.b(this.f19452b);
                return;
        }
    }
}
