package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f27354a;
    public final VideoAds f27355b;

    public d(VideoAds videoAds, int i7) {
        this.f27354a = i7;
        this.f27355b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f27354a) {
            case 0:
                VideoAds.r(this.f27355b);
                return;
            default:
                VideoAds.b(this.f27355b);
                return;
        }
    }
}
