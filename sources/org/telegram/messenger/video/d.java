package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f18695a;
    public final VideoAds f18696b;

    public d(VideoAds videoAds, int i10) {
        this.f18695a = i10;
        this.f18696b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f18695a) {
            case 0:
                VideoAds.b(this.f18696b);
                return;
            default:
                VideoAds.r(this.f18696b);
                return;
        }
    }
}
