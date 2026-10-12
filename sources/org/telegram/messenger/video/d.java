package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f18714a;
    public final VideoAds f18715b;

    public d(VideoAds videoAds, int i10) {
        this.f18714a = i10;
        this.f18715b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f18714a) {
            case 0:
                VideoAds.r(this.f18715b);
                return;
            default:
                VideoAds.b(this.f18715b);
                return;
        }
    }
}
