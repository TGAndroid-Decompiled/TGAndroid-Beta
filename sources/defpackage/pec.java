package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
public final class pec implements Runnable {
    public final byte a;
    public final VideoEncodingService b;

    public pec(VideoEncodingService videoEncodingService, byte b) {
        this.a = b;
        this.b = videoEncodingService;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoEncodingService videoEncodingService = this.b;
        switch (b) {
            case 0:
                VideoEncodingService videoEncodingService2 = VideoEncodingService.e;
                videoEncodingService.b();
                return;
            default:
                VideoEncodingService videoEncodingService3 = VideoEncodingService.e;
                so6 so6Var = MediaController.z().b0;
                if (so6Var != null) {
                    videoEncodingService.a(so6Var);
                    return;
                } else {
                    videoEncodingService.stopSelf();
                    return;
                }
        }
    }
}
