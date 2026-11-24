package defpackage;

import org.telegram.messenger.video.VideoAds;
public final class dac implements Runnable {
    public final byte a;
    public final VideoAds b;

    public dac(VideoAds videoAds, byte b) {
        this.a = b;
        this.b = videoAds;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoAds videoAds = this.b;
        switch (b) {
            case 0:
                VideoAds.r(videoAds);
                return;
            default:
                VideoAds.b(videoAds);
                return;
        }
    }
}
