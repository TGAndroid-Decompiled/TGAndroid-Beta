package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f25991a;
    public final VideoAds f25992b;

    public d(VideoAds videoAds, int i7) {
        this.f25991a = i7;
        this.f25992b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f25991a) {
            case 0:
                VideoAds.r(this.f25992b);
                return;
            default:
                VideoAds.b(this.f25992b);
                return;
        }
    }
}
