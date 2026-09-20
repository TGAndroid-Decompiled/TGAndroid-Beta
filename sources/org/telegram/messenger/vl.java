package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f17836a;
    public final VideoEncodingService f17837b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f17836a = i10;
        this.f17837b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17836a) {
            case 0:
                VideoEncodingService.a(this.f17837b);
                return;
            default:
                VideoEncodingService.b(this.f17837b);
                return;
        }
    }
}
