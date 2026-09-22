package org.telegram.messenger;
public final class vl implements Runnable {
    public final int f17851a;
    public final VideoEncodingService f17852b;

    public vl(VideoEncodingService videoEncodingService, int i10) {
        this.f17851a = i10;
        this.f17852b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f17851a) {
            case 0:
                VideoEncodingService.a(this.f17852b);
                return;
            default:
                VideoEncodingService.b(this.f17852b);
                return;
        }
    }
}
