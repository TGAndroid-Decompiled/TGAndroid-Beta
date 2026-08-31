package org.telegram.messenger;
public final class xl implements Runnable {
    public final int f20659a;
    public final VideoEncodingService f20660b;

    public xl(VideoEncodingService videoEncodingService, int i10) {
        this.f20659a = i10;
        this.f20660b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f20659a) {
            case 0:
                VideoEncodingService.a(this.f20660b);
                return;
            default:
                VideoEncodingService.b(this.f20660b);
                return;
        }
    }
}
