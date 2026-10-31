package org.telegram.messenger;
public final class y20 implements Runnable {
    public final int f19331a;
    public final VideoEncodingService f19332b;

    public y20(VideoEncodingService videoEncodingService, int i10) {
        this.f19331a = i10;
        this.f19332b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i10 = this.f19331a;
        VideoEncodingService videoEncodingService = this.f19332b;
        switch (i10) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                videoEncodingService.getClass();
                jf jfVar = MediaController.B().f14438a0;
                if (jfVar != null) {
                    videoEncodingService.a(jfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                videoEncodingService.b();
                return;
        }
    }
}
