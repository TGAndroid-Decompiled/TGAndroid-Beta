package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19264a;
    public final VideoAds f19265b;

    public d(VideoAds videoAds, int i10) {
        this.f19264a = i10;
        this.f19265b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19264a) {
            case 0:
                VideoAds.b(this.f19265b);
                return;
            default:
                VideoAds.r(this.f19265b);
                return;
        }
    }
}
