package org.telegram.messenger;
public final class sl implements Runnable {
    public final int f19553a;
    public final VideoEncodingService f19554b;

    public sl(VideoEncodingService videoEncodingService, int i10) {
        this.f19553a = i10;
        this.f19554b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                VideoEncodingService.a(this.f19554b);
                return;
            default:
                VideoEncodingService.b(this.f19554b);
                return;
        }
    }
}
