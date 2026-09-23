package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f17596a;
    public final VideoEncodingService f17597b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f17596a = i10;
        this.f17597b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17596a) {
            case 0:
                VideoEncodingService.a(this.f17597b);
                return;
            default:
                VideoEncodingService.b(this.f17597b);
                return;
        }
    }
}
