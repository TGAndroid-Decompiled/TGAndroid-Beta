package org.telegram.messenger;
public final class cm implements Runnable {
    public final int f17348a;
    public final VideoEncodingService f17349b;

    public cm(VideoEncodingService videoEncodingService, int i10) {
        this.f17348a = i10;
        this.f17349b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17348a) {
            case 0:
                VideoEncodingService.a(this.f17349b);
                return;
            default:
                VideoEncodingService.b(this.f17349b);
                return;
        }
    }
}
