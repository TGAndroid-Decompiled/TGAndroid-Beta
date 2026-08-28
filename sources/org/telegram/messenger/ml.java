package org.telegram.messenger;
public final class ml implements Runnable {
    public final int f21006a;
    public final VideoEncodingService f21007b;

    public ml(VideoEncodingService videoEncodingService, int i9) {
        this.f21006a = i9;
        this.f21007b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f21006a) {
            case 0:
                VideoEncodingService.a(this.f21007b);
                return;
            default:
                VideoEncodingService.b(this.f21007b);
                return;
        }
    }
}
