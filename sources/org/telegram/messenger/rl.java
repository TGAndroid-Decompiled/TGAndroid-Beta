package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f19459a;
    public final VideoEncodingService f19460b;

    public rl(VideoEncodingService videoEncodingService, int i10) {
        this.f19459a = i10;
        this.f19460b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19459a) {
            case 0:
                VideoEncodingService.a(this.f19460b);
                return;
            default:
                VideoEncodingService.b(this.f19460b);
                return;
        }
    }
}
