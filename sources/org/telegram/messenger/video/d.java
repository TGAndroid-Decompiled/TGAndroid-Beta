package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f25999a;
    public final VideoAds f26000b;

    public d(VideoAds videoAds, int i7) {
        this.f25999a = i7;
        this.f26000b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f25999a) {
            case 0:
                VideoAds.r(this.f26000b);
                return;
            default:
                VideoAds.b(this.f26000b);
                return;
        }
    }
}
