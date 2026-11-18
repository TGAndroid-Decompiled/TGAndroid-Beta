package org.telegram.messenger;
public final class f20 implements Runnable {
    public final int f23829a;
    public final VideoEncodingService f23830b;

    public f20(VideoEncodingService videoEncodingService, int i7) {
        this.f23829a = i7;
        this.f23830b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f23829a;
        VideoEncodingService videoEncodingService = this.f23830b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f22789e;
                videoEncodingService.getClass();
                jf jfVar = MediaController.B().f22700b0;
                if (jfVar != null) {
                    videoEncodingService.a(jfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f22789e;
                videoEncodingService.b();
                return;
        }
    }
}
