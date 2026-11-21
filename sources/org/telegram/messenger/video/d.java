package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f27410a;
    public final VideoAds f27411b;

    public d(VideoAds videoAds, int i7) {
        this.f27410a = i7;
        this.f27411b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f27410a) {
            case 0:
                VideoAds.r(this.f27411b);
                return;
            default:
                VideoAds.b(this.f27411b);
                return;
        }
    }
}
