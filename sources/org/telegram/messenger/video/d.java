package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17576a;
    public final VideoAds f17577b;

    public d(VideoAds videoAds, int i10) {
        this.f17576a = i10;
        this.f17577b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17576a) {
            case 0:
                VideoAds.r(this.f17577b);
                return;
            default:
                VideoAds.b(this.f17577b);
                return;
        }
    }
}
