package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f17745a;
    public final VideoEncodingService f17746b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f17745a = i10;
        this.f17746b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17745a) {
            case 0:
                VideoEncodingService.a(this.f17746b);
                return;
            default:
                VideoEncodingService.b(this.f17746b);
                return;
        }
    }
}
