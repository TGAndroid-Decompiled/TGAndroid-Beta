package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19719a;
    public final VideoEncodingService f19720b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19719a = i10;
        this.f19720b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19719a) {
            case 0:
                VideoEncodingService.a(this.f19720b);
                return;
            default:
                VideoEncodingService.b(this.f19720b);
                return;
        }
    }
}
