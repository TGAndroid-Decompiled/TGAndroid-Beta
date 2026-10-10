package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f19518a;
    public final VideoEncodingService f19519b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f19518a = i10;
        this.f19519b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19518a) {
            case 0:
                VideoEncodingService.a(this.f19519b);
                return;
            default:
                VideoEncodingService.b(this.f19519b);
                return;
        }
    }
}
