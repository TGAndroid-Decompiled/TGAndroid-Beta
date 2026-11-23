package org.telegram.messenger;
public final class g20 implements Runnable {
    public final int f24072a;
    public final VideoEncodingService f24073b;

    public g20(VideoEncodingService videoEncodingService, int i7) {
        this.f24072a = i7;
        this.f24073b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f24072a;
        VideoEncodingService videoEncodingService = this.f24073b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f22817e;
                videoEncodingService.getClass();
                kf kfVar = MediaController.B().f22728b0;
                if (kfVar != null) {
                    videoEncodingService.a(kfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f22817e;
                videoEncodingService.b();
                return;
        }
    }
}
