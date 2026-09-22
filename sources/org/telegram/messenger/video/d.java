package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17564a;
    public final VideoAds f17565b;

    public d(VideoAds videoAds, int i10) {
        this.f17564a = i10;
        this.f17565b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17564a) {
            case 0:
                VideoAds.r(this.f17565b);
                return;
            default:
                VideoAds.b(this.f17565b);
                return;
        }
    }
}
