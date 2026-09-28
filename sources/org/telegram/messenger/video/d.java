package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17810a;
    public final VideoAds f17811b;

    public d(VideoAds videoAds, int i10) {
        this.f17810a = i10;
        this.f17811b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17810a) {
            case 0:
                VideoAds.r(this.f17811b);
                return;
            default:
                VideoAds.b(this.f17811b);
                return;
        }
    }
}
