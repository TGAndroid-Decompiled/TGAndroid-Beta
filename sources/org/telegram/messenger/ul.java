package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f17729a;
    public final VideoEncodingService f17730b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f17729a = i10;
        this.f17730b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17729a) {
            case 0:
                VideoEncodingService.a(this.f17730b);
                return;
            default:
                VideoEncodingService.b(this.f17730b);
                return;
        }
    }
}
