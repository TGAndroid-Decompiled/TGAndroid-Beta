package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f27390a;
    public final VideoAds f27391b;

    public d(VideoAds videoAds, int i7) {
        this.f27390a = i7;
        this.f27391b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f27390a) {
            case 0:
                VideoAds.r(this.f27391b);
                return;
            default:
                VideoAds.b(this.f27391b);
                return;
        }
    }
}
