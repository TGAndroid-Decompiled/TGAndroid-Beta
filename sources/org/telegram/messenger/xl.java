package org.telegram.messenger;
public final class xl implements Runnable {
    public final int f18989a;
    public final VideoEncodingService f18990b;

    public xl(VideoEncodingService videoEncodingService, int i10) {
        this.f18989a = i10;
        this.f18990b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f18989a) {
            case 0:
                VideoEncodingService.a(this.f18990b);
                return;
            default:
                VideoEncodingService.b(this.f18990b);
                return;
        }
    }
}
