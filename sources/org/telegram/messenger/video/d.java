package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19779a;
    public final VideoAds f19780b;

    public d(VideoAds videoAds, int i10) {
        this.f19779a = i10;
        this.f19780b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19779a) {
            case 0:
                VideoAds.r(this.f19780b);
                return;
            default:
                VideoAds.b(this.f19780b);
                return;
        }
    }
}
