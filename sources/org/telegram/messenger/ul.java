package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19413a;
    public final VideoEncodingService f19414b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19413a = i10;
        this.f19414b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19413a) {
            case 0:
                VideoEncodingService.a(this.f19414b);
                return;
            default:
                VideoEncodingService.b(this.f19414b);
                return;
        }
    }
}
