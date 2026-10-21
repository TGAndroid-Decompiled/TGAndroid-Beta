package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f19619a;
    public final VideoEncodingService f19620b;

    public tl(VideoEncodingService videoEncodingService, int i10) {
        this.f19619a = i10;
        this.f19620b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19619a) {
            case 0:
                VideoEncodingService.a(this.f19620b);
                return;
            default:
                VideoEncodingService.b(this.f19620b);
                return;
        }
    }
}
