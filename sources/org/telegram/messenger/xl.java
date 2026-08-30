package org.telegram.messenger;
public final class xl implements Runnable {
    public final int f19002a;
    public final VideoEncodingService f19003b;

    public xl(VideoEncodingService videoEncodingService, int i10) {
        this.f19002a = i10;
        this.f19003b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19002a) {
            case 0:
                VideoEncodingService.a(this.f19003b);
                return;
            default:
                VideoEncodingService.b(this.f19003b);
                return;
        }
    }
}
