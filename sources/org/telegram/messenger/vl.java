package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f19340a;
    public final VideoEncodingService f19341b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f19340a = i10;
        this.f19341b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                VideoEncodingService.a(this.f19341b);
                return;
            default:
                VideoEncodingService.b(this.f19341b);
                return;
        }
    }
}
