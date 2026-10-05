package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19372a;
    public final VideoEncodingService f19373b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19372a = i10;
        this.f19373b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19372a) {
            case 0:
                VideoEncodingService.a(this.f19373b);
                return;
            default:
                VideoEncodingService.b(this.f19373b);
                return;
        }
    }
}
