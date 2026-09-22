package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17796a;
    public final VideoAds f17797b;

    public d(VideoAds videoAds, int i10) {
        this.f17796a = i10;
        this.f17797b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17796a) {
            case 0:
                VideoAds.r(this.f17797b);
                return;
            default:
                VideoAds.b(this.f17797b);
                return;
        }
    }
}
