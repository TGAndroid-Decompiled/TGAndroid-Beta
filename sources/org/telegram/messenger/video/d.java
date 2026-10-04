package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19446a;
    public final VideoAds f19447b;

    public d(VideoAds videoAds, int i10) {
        this.f19446a = i10;
        this.f19447b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19446a) {
            case 0:
                VideoAds.r(this.f19447b);
                return;
            default:
                VideoAds.b(this.f19447b);
                return;
        }
    }
}
