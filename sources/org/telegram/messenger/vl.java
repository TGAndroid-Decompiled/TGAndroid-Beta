package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f17621a;
    public final VideoEncodingService f17622b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f17621a = i10;
        this.f17622b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17621a) {
            case 0:
                VideoEncodingService.a(this.f17622b);
                return;
            default:
                VideoEncodingService.b(this.f17622b);
                return;
        }
    }
}
