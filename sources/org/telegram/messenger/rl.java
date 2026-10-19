package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f19462a;
    public final VideoEncodingService f19463b;

    public rl(VideoEncodingService videoEncodingService, int i10) {
        this.f19462a = i10;
        this.f19463b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19462a) {
            case 0:
                VideoEncodingService.a(this.f19463b);
                return;
            default:
                VideoEncodingService.b(this.f19463b);
                return;
        }
    }
}
