package org.telegram.messenger;
public final class c20 implements Runnable {
    public final int f21934a;
    public final VideoEncodingService f21935b;

    public c20(VideoEncodingService videoEncodingService, int i3) {
        this.f21934a = i3;
        this.f21935b = videoEncodingService;
    }

    @Override
    public final void run() {
        int i3 = this.f21934a;
        VideoEncodingService videoEncodingService = this.f21935b;
        switch (i3) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.f21394e;
                videoEncodingService.getClass();
                cf cfVar = MediaController.B().f21305b0;
                if (cfVar != null) {
                    videoEncodingService.a(cfVar);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.f21394e;
                videoEncodingService.b();
                return;
        }
    }
}
