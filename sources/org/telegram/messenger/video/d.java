package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f16627a;
    public final VideoAds f16628b;

    public d(VideoAds videoAds, int i10) {
        this.f16627a = i10;
        this.f16628b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f16627a) {
            case 0:
                VideoAds.b(this.f16628b);
                return;
            default:
                VideoAds.r(this.f16628b);
                return;
        }
    }
}
