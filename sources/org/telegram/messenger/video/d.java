package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19777a;
    public final VideoAds f19778b;

    public d(VideoAds videoAds, int i10) {
        this.f19777a = i10;
        this.f19778b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19777a) {
            case 0:
                VideoAds.r(this.f19778b);
                return;
            default:
                VideoAds.b(this.f19778b);
                return;
        }
    }
}
