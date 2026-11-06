package org.telegram.messenger;
public final class k20 implements Runnable {
    public final int f23653a;
    public final VideoEncodingService f23654b;

    public k20(VideoEncodingService videoEncodingService, int i7) {
        this.f23653a = i7;
        this.f23654b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f23653a;
        VideoEncodingService videoEncodingService = this.f23654b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f21340e;
                videoEncodingService.getClass();
                lf lfVar = MediaController.B().f21248a0;
                if (lfVar != null) {
                    videoEncodingService.a(lfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f21340e;
                videoEncodingService.b();
                return;
        }
    }
}
