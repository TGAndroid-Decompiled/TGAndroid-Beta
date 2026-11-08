package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f26002a;
    public final VideoAds f26003b;

    public d(VideoAds videoAds, int i7) {
        this.f26002a = i7;
        this.f26003b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f26002a) {
            case 0:
                VideoAds.r(this.f26003b);
                return;
            default:
                VideoAds.b(this.f26003b);
                return;
        }
    }
}
