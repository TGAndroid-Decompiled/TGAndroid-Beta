package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19852a;
    public final VideoAds f19853b;

    public d(VideoAds videoAds, int i10) {
        this.f19852a = i10;
        this.f19853b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19852a) {
            case 0:
                VideoAds.r(this.f19853b);
                return;
            default:
                VideoAds.b(this.f19853b);
                return;
        }
    }
}
