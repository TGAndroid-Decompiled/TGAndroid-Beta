package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f18409a;
    public final VideoAds f18410b;

    public d(VideoAds videoAds, int i10) {
        this.f18409a = i10;
        this.f18410b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f18409a) {
            case 0:
                VideoAds.r(this.f18410b);
                return;
            default:
                VideoAds.b(this.f18410b);
                return;
        }
    }
}
