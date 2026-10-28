package org.telegram.messenger;
public final class xl implements Runnable {
    public final int f21865a;
    public final VideoEncodingService f21866b;

    public xl(VideoEncodingService videoEncodingService, int i10) {
        this.f21865a = i10;
        this.f21866b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f21865a) {
            case 0:
                VideoEncodingService.a(this.f21866b);
                return;
            default:
                VideoEncodingService.b(this.f21866b);
                return;
        }
    }
}
