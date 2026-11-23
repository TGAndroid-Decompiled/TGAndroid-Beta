package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f27478a;
    public final VideoAds f27479b;

    public d(VideoAds videoAds, int i7) {
        this.f27478a = i7;
        this.f27479b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f27478a) {
            case 0:
                VideoAds.r(this.f27479b);
                return;
            default:
                VideoAds.b(this.f27479b);
                return;
        }
    }
}
