package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f26006a;
    public final VideoAds f26007b;

    public d(VideoAds videoAds, int i7) {
        this.f26006a = i7;
        this.f26007b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f26006a) {
            case 0:
                VideoAds.r(this.f26007b);
                return;
            default:
                VideoAds.b(this.f26007b);
                return;
        }
    }
}
