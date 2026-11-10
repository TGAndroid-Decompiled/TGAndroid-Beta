package org.telegram.messenger;
public final class k20 implements Runnable {
    public final int f23657a;
    public final VideoEncodingService f23658b;

    public k20(VideoEncodingService videoEncodingService, int i7) {
        this.f23657a = i7;
        this.f23658b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i7 = this.f23657a;
        VideoEncodingService videoEncodingService = this.f23658b;
        switch (i7) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f21348e;
                videoEncodingService.getClass();
                lf lfVar = MediaController.B().f21256a0;
                if (lfVar != null) {
                    videoEncodingService.a(lfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f21348e;
                videoEncodingService.b();
                return;
        }
    }
}
