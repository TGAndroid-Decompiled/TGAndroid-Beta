package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17750a;
    public final VideoAds f17751b;

    public d(VideoAds videoAds, int i10) {
        this.f17750a = i10;
        this.f17751b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17750a) {
            case 0:
                VideoAds.r(this.f17751b);
                return;
            default:
                VideoAds.b(this.f17751b);
                return;
        }
    }
}
