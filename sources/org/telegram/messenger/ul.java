package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f17703a;
    public final VideoEncodingService f17704b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f17703a = i10;
        this.f17704b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17703a) {
            case 0:
                VideoEncodingService.a(this.f17704b);
                return;
            default:
                VideoEncodingService.b(this.f17704b);
                return;
        }
    }
}
