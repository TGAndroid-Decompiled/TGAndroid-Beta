package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f27384a;
    public final VideoAds f27385b;

    public d(VideoAds videoAds, int i7) {
        this.f27384a = i7;
        this.f27385b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f27384a) {
            case 0:
                VideoAds.r(this.f27385b);
                return;
            default:
                VideoAds.b(this.f27385b);
                return;
        }
    }
}
