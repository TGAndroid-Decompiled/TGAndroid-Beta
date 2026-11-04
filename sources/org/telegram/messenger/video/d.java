package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f25899a;
    public final VideoAds f25900b;

    public d(VideoAds videoAds, int i3) {
        this.f25899a = i3;
        this.f25900b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f25899a) {
            case 0:
                VideoAds.r(this.f25900b);
                return;
            default:
                VideoAds.b(this.f25900b);
                return;
        }
    }
}
