package org.telegram.messenger;
public final class dm implements Runnable {
    public final int f15028a;
    public final VideoEncodingService f15029b;

    public dm(VideoEncodingService videoEncodingService, int i10) {
        this.f15028a = i10;
        this.f15029b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f15028a) {
            case 0:
                VideoEncodingService.a(this.f15029b);
                return;
            default:
                VideoEncodingService.b(this.f15029b);
                return;
        }
    }
}
