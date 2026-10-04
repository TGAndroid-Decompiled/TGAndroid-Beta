package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19454a;
    public final VideoAds f19455b;

    public d(VideoAds videoAds, int i10) {
        this.f19454a = i10;
        this.f19455b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19454a) {
            case 0:
                VideoAds.r(this.f19455b);
                return;
            default:
                VideoAds.b(this.f19455b);
                return;
        }
    }
}
