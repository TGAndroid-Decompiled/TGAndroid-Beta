package org.telegram.messenger;
public final class wl implements Runnable {
    public final int f21783a;
    public final VideoEncodingService f21784b;

    public wl(VideoEncodingService videoEncodingService, int i10) {
        this.f21783a = i10;
        this.f21784b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f21783a) {
            case 0:
                VideoEncodingService.a(this.f21784b);
                return;
            default:
                VideoEncodingService.b(this.f21784b);
                return;
        }
    }
}
