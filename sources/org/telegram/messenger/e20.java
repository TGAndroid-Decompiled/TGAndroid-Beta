package org.telegram.messenger;
public final class e20 implements Runnable {
    public final int f23759a;
    public final VideoEncodingService f23760b;

    public e20(VideoEncodingService videoEncodingService, int i7) {
        this.f23759a = i7;
        this.f23760b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f23759a;
        VideoEncodingService videoEncodingService = this.f23760b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f22884e;
                videoEncodingService.getClass();
                jf jfVar = MediaController.B().f22795b0;
                if (jfVar != null) {
                    videoEncodingService.a(jfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f22884e;
                videoEncodingService.b();
                return;
        }
    }
}
