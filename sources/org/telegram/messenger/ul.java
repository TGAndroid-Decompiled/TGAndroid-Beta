package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f19784a;
    public final VideoEncodingService f19785b;

    public ul(VideoEncodingService videoEncodingService, int i10) {
        this.f19784a = i10;
        this.f19785b = videoEncodingService;
    }

    @Override
    public final void run() {
        switch (this.f19784a) {
            case 0:
                VideoEncodingService.a(this.f19785b);
                return;
            default:
                VideoEncodingService.b(this.f19785b);
                return;
        }
    }
}
