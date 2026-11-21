package org.telegram.messenger;
public final class f20 implements Runnable {
    public final int f23854a;
    public final VideoEncodingService f23855b;

    public f20(VideoEncodingService videoEncodingService, int i7) {
        this.f23854a = i7;
        this.f23855b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f23854a;
        VideoEncodingService videoEncodingService = this.f23855b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f22814e;
                videoEncodingService.getClass();
                jf jfVar = MediaController.B().f22725b0;
                if (jfVar != null) {
                    videoEncodingService.a(jfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f22814e;
                videoEncodingService.b();
                return;
        }
    }
}
