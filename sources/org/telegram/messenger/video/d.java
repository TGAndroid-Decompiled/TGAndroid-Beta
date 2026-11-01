package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f18704a;
    public final VideoAds f18705b;

    public d(VideoAds videoAds, int i10) {
        this.f18704a = i10;
        this.f18705b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f18704a) {
            case 0:
                VideoAds.r(this.f18705b);
                return;
            default:
                VideoAds.b(this.f18705b);
                return;
        }
    }
}
