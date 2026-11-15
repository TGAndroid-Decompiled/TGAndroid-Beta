package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f27003a;
    public final VideoAds f27004b;

    public d(VideoAds videoAds, int i7) {
        this.f27003a = i7;
        this.f27004b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f27003a) {
            case 0:
                VideoAds.r(this.f27004b);
                return;
            default:
                VideoAds.b(this.f27004b);
                return;
        }
    }
}
