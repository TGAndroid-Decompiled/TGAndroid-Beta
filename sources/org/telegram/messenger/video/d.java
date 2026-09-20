package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17781a;
    public final VideoAds f17782b;

    public d(VideoAds videoAds, int i10) {
        this.f17781a = i10;
        this.f17782b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17781a) {
            case 0:
                VideoAds.r(this.f17782b);
                return;
            default:
                VideoAds.b(this.f17782b);
                return;
        }
    }
}
