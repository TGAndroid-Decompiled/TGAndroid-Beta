package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19365a;
    public final VideoEncodingService f19366b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19365a = i10;
        this.f19366b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19365a) {
            case 0:
                VideoEncodingService.a(this.f19366b);
                return;
            default:
                VideoEncodingService.b(this.f19366b);
                return;
        }
    }
}
