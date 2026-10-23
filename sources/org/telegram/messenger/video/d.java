package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f19789a;
    public final VideoAds f19790b;

    public d(VideoAds videoAds, int i10) {
        this.f19789a = i10;
        this.f19790b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f19789a) {
            case 0:
                VideoAds.r(this.f19790b);
                return;
            default:
                VideoAds.b(this.f19790b);
                return;
        }
    }
}
