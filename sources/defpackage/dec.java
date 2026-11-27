package defpackage;

import org.telegram.messenger.video.VideoAds;
public final class dec implements Runnable {
    public final byte a;
    public final VideoAds b;

    public dec(VideoAds videoAds, byte b) {
        this.a = b;
        this.b = videoAds;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoAds videoAds = this.b;
        switch (b) {
            case 0:
                VideoAds.k(videoAds);
                return;
            default:
                VideoAds.n(videoAds);
                return;
        }
    }
}
