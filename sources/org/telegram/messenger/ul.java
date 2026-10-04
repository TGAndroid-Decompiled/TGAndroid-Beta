package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19364a;
    public final VideoEncodingService f19365b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19364a = i10;
        this.f19365b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19364a) {
            case 0:
                VideoEncodingService.a(this.f19365b);
                return;
            default:
                VideoEncodingService.b(this.f19365b);
                return;
        }
    }
}
