package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f18677a;
    public final VideoAds f18678b;

    public d(VideoAds videoAds, int i10) {
        this.f18677a = i10;
        this.f18678b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f18677a) {
            case 0:
                VideoAds.b(this.f18678b);
                return;
            default:
                VideoAds.r(this.f18678b);
                return;
        }
    }
}
