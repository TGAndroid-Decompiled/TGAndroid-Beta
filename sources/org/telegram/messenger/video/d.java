package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f27382a;
    public final VideoAds f27383b;

    public d(VideoAds videoAds, int i7) {
        this.f27382a = i7;
        this.f27383b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f27382a) {
            case 0:
                VideoAds.r(this.f27383b);
                return;
            default:
                VideoAds.b(this.f27383b);
                return;
        }
    }
}
