package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19241a;
    public final VideoAds f19242b;

    public d(VideoAds videoAds, int i10) {
        this.f19241a = i10;
        this.f19242b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19241a) {
            case 0:
                VideoAds.r(this.f19242b);
                return;
            default:
                VideoAds.b(this.f19242b);
                return;
        }
    }
}
