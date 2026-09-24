package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17784a;
    public final VideoAds f17785b;

    public d(VideoAds videoAds, int i10) {
        this.f17784a = i10;
        this.f17785b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17784a) {
            case 0:
                VideoAds.r(this.f17785b);
                return;
            default:
                VideoAds.b(this.f17785b);
                return;
        }
    }
}
