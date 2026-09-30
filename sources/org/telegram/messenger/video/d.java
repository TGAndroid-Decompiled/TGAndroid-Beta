package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17826a;
    public final VideoAds f17827b;

    public d(VideoAds videoAds, int i10) {
        this.f17826a = i10;
        this.f17827b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17826a) {
            case 0:
                VideoAds.r(this.f17827b);
                return;
            default:
                VideoAds.b(this.f17827b);
                return;
        }
    }
}
