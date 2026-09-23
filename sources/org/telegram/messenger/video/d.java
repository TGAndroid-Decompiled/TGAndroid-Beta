package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17544a;
    public final VideoAds f17545b;

    public d(VideoAds videoAds, int i10) {
        this.f17544a = i10;
        this.f17545b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17544a) {
            case 0:
                VideoAds.r(this.f17545b);
                return;
            default:
                VideoAds.b(this.f17545b);
                return;
        }
    }
}
