package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17809a;
    public final VideoAds f17810b;

    public d(VideoAds videoAds, int i10) {
        this.f17809a = i10;
        this.f17810b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17809a) {
            case 0:
                VideoAds.r(this.f17810b);
                return;
            default:
                VideoAds.b(this.f17810b);
                return;
        }
    }
}
