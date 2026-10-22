package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f19838a;
    public final VideoEncodingService f19839b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f19838a = i10;
        this.f19839b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19838a) {
            case 0:
                VideoEncodingService.a(this.f19839b);
                return;
            default:
                VideoEncodingService.b(this.f19839b);
                return;
        }
    }
}
