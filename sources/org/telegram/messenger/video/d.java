package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19291a;
    public final VideoAds f19292b;

    public d(VideoAds videoAds, int i10) {
        this.f19291a = i10;
        this.f19292b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19291a) {
            case 0:
                VideoAds.b(this.f19292b);
                return;
            default:
                VideoAds.r(this.f19292b);
                return;
        }
    }
}
