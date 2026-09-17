package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19213a;
    public final VideoEncodingService f19214b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19213a = i10;
        this.f19214b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19213a) {
            case 0:
                VideoEncodingService.a(this.f19214b);
                return;
            default:
                VideoEncodingService.b(this.f19214b);
                return;
        }
    }
}
