package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19494a;
    public final VideoAds f19495b;

    public d(VideoAds videoAds, int i10) {
        this.f19494a = i10;
        this.f19495b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19494a) {
            case 0:
                VideoAds.r(this.f19495b);
                return;
            default:
                VideoAds.b(this.f19495b);
                return;
        }
    }
}
