package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f19313a;
    public final VideoEncodingService f19314b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f19313a = i10;
        this.f19314b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19313a) {
            case 0:
                VideoEncodingService.a(this.f19314b);
                return;
            default:
                VideoEncodingService.b(this.f19314b);
                return;
        }
    }
}
