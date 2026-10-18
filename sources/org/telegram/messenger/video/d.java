package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19774a;
    public final VideoAds f19775b;

    public d(VideoAds videoAds, int i10) {
        this.f19774a = i10;
        this.f19775b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19774a) {
            case 0:
                VideoAds.r(this.f19775b);
                return;
            default:
                VideoAds.b(this.f19775b);
                return;
        }
    }
}
