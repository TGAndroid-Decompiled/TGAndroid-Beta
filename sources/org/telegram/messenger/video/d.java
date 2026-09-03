package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f20319a;
    public final VideoAds f20320b;

    public d(VideoAds videoAds, int i10) {
        this.f20319a = i10;
        this.f20320b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f20319a) {
            case 0:
                VideoAds.b(this.f20320b);
                return;
            default:
                VideoAds.r(this.f20320b);
                return;
        }
    }
}
