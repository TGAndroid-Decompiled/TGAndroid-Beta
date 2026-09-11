package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19186a;
    public final VideoEncodingService f19187b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19186a = i10;
        this.f19187b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19186a) {
            case 0:
                VideoEncodingService.a(this.f19187b);
                return;
            default:
                VideoEncodingService.b(this.f19187b);
                return;
        }
    }
}
