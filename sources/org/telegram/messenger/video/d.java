package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19796a;
    public final VideoAds f19797b;

    public d(VideoAds videoAds, int i10) {
        this.f19796a = i10;
        this.f19797b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19796a) {
            case 0:
                VideoAds.r(this.f19797b);
                return;
            default:
                VideoAds.b(this.f19797b);
                return;
        }
    }
}
