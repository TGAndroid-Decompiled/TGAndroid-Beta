package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19771a;
    public final VideoAds f19772b;

    public d(VideoAds videoAds, int i10) {
        this.f19771a = i10;
        this.f19772b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19771a) {
            case 0:
                VideoAds.r(this.f19772b);
                return;
            default:
                VideoAds.b(this.f19772b);
                return;
        }
    }
}
