package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f17799a;
    public final VideoAds f17800b;

    public d(VideoAds videoAds, int i10) {
        this.f17799a = i10;
        this.f17800b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f17799a) {
            case 0:
                VideoAds.r(this.f17800b);
                return;
            default:
                VideoAds.b(this.f17800b);
                return;
        }
    }
}
