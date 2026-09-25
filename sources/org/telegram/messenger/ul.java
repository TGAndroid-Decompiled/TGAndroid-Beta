package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f17718a;
    public final VideoEncodingService f17719b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f17718a = i10;
        this.f17719b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17718a) {
            case 0:
                VideoEncodingService.a(this.f17719b);
                return;
            default:
                VideoEncodingService.b(this.f17719b);
                return;
        }
    }
}
