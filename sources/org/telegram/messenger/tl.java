package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f21681a;
    public final VideoEncodingService f21682b;

    public tl(VideoEncodingService videoEncodingService, int i10) {
        this.f21681a = i10;
        this.f21682b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f21681a) {
            case 0:
                VideoEncodingService.a(this.f21682b);
                return;
            default:
                VideoEncodingService.b(this.f21682b);
                return;
        }
    }
}
