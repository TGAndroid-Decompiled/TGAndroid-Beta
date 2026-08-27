package org.telegram.messenger.video;

public final class d implements Runnable {

    public final int f21830a;

    public final VideoAds f21831b;

    public d(VideoAds videoAds, int i10) {
        this.f21830a = i10;
        this.f21831b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f21830a) {
            case 0:
                this.f21831b.show();
                break;
            default:
                this.f21831b.showPremium();
                break;
        }
    }
}
