package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19382a;
    public final VideoEncodingService f19383b;

    public ql(VideoEncodingService videoEncodingService, int i10) {
        this.f19382a = i10;
        this.f19383b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19382a) {
            case 0:
                VideoEncodingService.a(this.f19383b);
                return;
            default:
                VideoEncodingService.b(this.f19383b);
                return;
        }
    }
}
