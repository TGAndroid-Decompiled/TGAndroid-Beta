package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f18549a;
    public final VideoAds f18550b;

    public d(VideoAds videoAds, int i10) {
        this.f18549a = i10;
        this.f18550b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f18549a) {
            case 0:
                VideoAds.r(this.f18550b);
                return;
            default:
                VideoAds.b(this.f18550b);
                return;
        }
    }
}
