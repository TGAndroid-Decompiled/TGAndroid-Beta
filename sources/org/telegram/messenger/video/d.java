package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17793a;
    public final VideoAds f17794b;

    public d(VideoAds videoAds, int i10) {
        this.f17793a = i10;
        this.f17794b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17793a) {
            case 0:
                VideoAds.r(this.f17794b);
                return;
            default:
                VideoAds.b(this.f17794b);
                return;
        }
    }
}
