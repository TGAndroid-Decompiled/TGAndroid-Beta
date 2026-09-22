package org.telegram.messenger;
public final class wl implements Runnable {
    public final int f17811a;
    public final VideoEncodingService f17812b;

    public wl(VideoEncodingService videoEncodingService, int i10) {
        this.f17811a = i10;
        this.f17812b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17811a) {
            case 0:
                VideoEncodingService.a(this.f17812b);
                return;
            default:
                VideoEncodingService.b(this.f17812b);
                return;
        }
    }
}
