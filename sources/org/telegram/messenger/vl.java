package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f19514a;
    public final VideoEncodingService f19515b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f19514a = i10;
        this.f19515b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19514a) {
            case 0:
                VideoEncodingService.a(this.f19515b);
                return;
            default:
                VideoEncodingService.b(this.f19515b);
                return;
        }
    }
}
