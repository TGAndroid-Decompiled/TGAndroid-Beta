package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f17728a;
    public final VideoEncodingService f17729b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f17728a = i10;
        this.f17729b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17728a) {
            case 0:
                VideoEncodingService.a(this.f17729b);
                return;
            default:
                VideoEncodingService.b(this.f17729b);
                return;
        }
    }
}
