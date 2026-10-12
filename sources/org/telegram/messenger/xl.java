package org.telegram.messenger;
public final class xl implements Runnable {
    public final int f19045a;
    public final VideoEncodingService f19046b;

    public xl(VideoEncodingService videoEncodingService, int i10) {
        this.f19045a = i10;
        this.f19046b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19045a) {
            case 0:
                VideoEncodingService.a(this.f19046b);
                return;
            default:
                VideoEncodingService.b(this.f19046b);
                return;
        }
    }
}
