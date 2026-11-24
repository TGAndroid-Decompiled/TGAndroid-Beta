package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
public final class scc implements Runnable {
    public final byte a;
    public final VideoEncodingService b;

    public scc(VideoEncodingService videoEncodingService, byte b) {
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
                oo6 oo6Var = MediaController.w().b0;
                if (oo6Var != null) {
                    videoEncodingService.a(oo6Var);
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
