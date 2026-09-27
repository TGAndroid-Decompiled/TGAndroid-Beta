package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f17712a;
    public final VideoEncodingService f17713b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f17712a = i10;
        this.f17713b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17712a) {
            case 0:
                VideoEncodingService.a(this.f17713b);
                return;
            default:
                VideoEncodingService.b(this.f17713b);
                return;
        }
    }
}
