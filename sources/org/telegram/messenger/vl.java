package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f19901a;
    public final VideoEncodingService f19902b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f19901a = i10;
        this.f19902b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19901a) {
            case 0:
                VideoEncodingService.a(this.f19902b);
                return;
            default:
                VideoEncodingService.b(this.f19902b);
                return;
        }
    }
}
