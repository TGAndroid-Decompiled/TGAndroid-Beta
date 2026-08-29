package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f21858a;
    public final VideoAds f21859b;

    public d(VideoAds videoAds, int i10) {
        this.f21858a = i10;
        this.f21859b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f21858a) {
            case 0:
                VideoAds.b(this.f21859b);
                return;
            default:
                VideoAds.r(this.f21859b);
                return;
        }
    }
}
