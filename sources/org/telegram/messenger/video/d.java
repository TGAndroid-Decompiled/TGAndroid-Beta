package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19242a;
    public final VideoAds f19243b;

    public d(VideoAds videoAds, int i10) {
        this.f19242a = i10;
        this.f19243b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19242a) {
            case 0:
                VideoAds.r(this.f19243b);
                return;
            default:
                VideoAds.b(this.f19243b);
                return;
        }
    }
}
