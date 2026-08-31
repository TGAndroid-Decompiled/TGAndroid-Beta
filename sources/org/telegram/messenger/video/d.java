package org.telegram.messenger.video;
public final class d implements Runnable {
    public final int f20317a;
    public final VideoAds f20318b;

    public d(VideoAds videoAds, int i10) {
        this.f20317a = i10;
        this.f20318b = videoAds;
    }

    @Override
    public final void run() {
        switch (this.f20317a) {
            case 0:
                VideoAds.b(this.f20318b);
                return;
            default:
                VideoAds.r(this.f20318b);
                return;
        }
    }
}
