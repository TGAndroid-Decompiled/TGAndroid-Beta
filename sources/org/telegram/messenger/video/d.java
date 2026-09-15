package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17567a;
    public final VideoAds f17568b;

    public d(VideoAds videoAds, int i10) {
        this.f17567a = i10;
        this.f17568b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17567a) {
            case 0:
                VideoAds.b(this.f17568b);
                return;
            default:
                VideoAds.r(this.f17568b);
                return;
        }
    }
}
