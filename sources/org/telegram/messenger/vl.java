package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f17798a;
    public final VideoEncodingService f17799b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f17798a = i10;
        this.f17799b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17798a) {
            case 0:
                VideoEncodingService.a(this.f17799b);
                return;
            default:
                VideoEncodingService.b(this.f17799b);
                return;
        }
    }
}
