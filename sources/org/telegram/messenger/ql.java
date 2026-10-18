package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19385a;
    public final VideoEncodingService f19386b;

    public ql(VideoEncodingService videoEncodingService, int i10) {
        this.f19385a = i10;
        this.f19386b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19385a) {
            case 0:
                VideoEncodingService.a(this.f19386b);
                return;
            default:
                VideoEncodingService.b(this.f19386b);
                return;
        }
    }
}
