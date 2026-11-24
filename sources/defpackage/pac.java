package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.VideoEncodingService;
public final class pac implements Runnable {
    public final byte a;
    public final VideoEncodingService b;

    public pac(VideoEncodingService videoEncodingService, byte b) {
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
                om6 om6Var = MediaController.w().b0;
                if (om6Var != null) {
                    videoEncodingService.a(om6Var);
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
