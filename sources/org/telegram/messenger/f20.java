package org.telegram.messenger;
public final class f20 implements Runnable {
    public final int f23826a;
    public final VideoEncodingService f23827b;

    public f20(VideoEncodingService videoEncodingService, int i7) {
        this.f23826a = i7;
        this.f23827b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f23826a;
        VideoEncodingService videoEncodingService = this.f23827b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f22786e;
                videoEncodingService.getClass();
                jf jfVar = MediaController.B().f22697b0;
                if (jfVar != null) {
                    videoEncodingService.a(jfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f22786e;
                videoEncodingService.b();
                return;
        }
    }
}
