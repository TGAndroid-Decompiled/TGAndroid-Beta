package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19377a;
    public final VideoEncodingService f19378b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19377a = i10;
        this.f19378b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19377a) {
            case 0:
                VideoEncodingService.a(this.f19378b);
                return;
            default:
                VideoEncodingService.b(this.f19378b);
                return;
        }
    }
}
