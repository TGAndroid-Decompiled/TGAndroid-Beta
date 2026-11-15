package org.telegram.messenger;
public final class h20 implements Runnable {
    public final int f24050a;
    public final VideoEncodingService f24051b;

    public h20(VideoEncodingService videoEncodingService, int i7) {
        this.f24050a = i7;
        this.f24051b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f24050a;
        VideoEncodingService videoEncodingService = this.f24051b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f22423e;
                videoEncodingService.getClass();
                kf kfVar = MediaController.B().f22334b0;
                if (kfVar != null) {
                    videoEncodingService.a(kfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f22423e;
                videoEncodingService.b();
                return;
        }
    }
}
