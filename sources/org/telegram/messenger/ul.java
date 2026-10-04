package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19367a;
    public final VideoEncodingService f19368b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19367a = i10;
        this.f19368b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19367a) {
            case 0:
                VideoEncodingService.a(this.f19368b);
                return;
            default:
                VideoEncodingService.b(this.f19368b);
                return;
        }
    }
}
