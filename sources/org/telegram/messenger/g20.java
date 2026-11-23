package org.telegram.messenger;
public final class g20 implements Runnable {
    public final int f24036a;
    public final VideoEncodingService f24037b;

    public g20(VideoEncodingService videoEncodingService, int i7) {
        this.f24036a = i7;
        this.f24037b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f24036a;
        VideoEncodingService videoEncodingService = this.f24037b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f22781e;
                videoEncodingService.getClass();
                kf kfVar = MediaController.B().f22692b0;
                if (kfVar != null) {
                    videoEncodingService.a(kfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f22781e;
                videoEncodingService.b();
                return;
        }
    }
}
