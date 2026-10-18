package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19782a;
    public final VideoAds f19783b;

    public d(VideoAds videoAds, int i10) {
        this.f19782a = i10;
        this.f19783b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19782a) {
            case 0:
                VideoAds.r(this.f19783b);
                return;
            default:
                VideoAds.b(this.f19783b);
                return;
        }
    }
}
