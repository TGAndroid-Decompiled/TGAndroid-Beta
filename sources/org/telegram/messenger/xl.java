package org.telegram.messenger;
public final class xl implements Runnable {
    public final int f20661a;
    public final VideoEncodingService f20662b;

    public xl(VideoEncodingService videoEncodingService, int i10) {
        this.f20661a = i10;
        this.f20662b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f20661a) {
            case 0:
                VideoEncodingService.a(this.f20662b);
                return;
            default:
                VideoEncodingService.b(this.f20662b);
                return;
        }
    }
}
