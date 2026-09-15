package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f17612a;
    public final VideoEncodingService f17613b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f17612a = i10;
        this.f17613b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17612a) {
            case 0:
                VideoEncodingService.a(this.f17613b);
                return;
            default:
                VideoEncodingService.b(this.f17613b);
                return;
        }
    }
}
