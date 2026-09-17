package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.xi0;
public final class c0 implements ThreadFactory {
    public final int f8764a;

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f8764a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "Lottie-" + xi0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + xi0.Q0.getAndIncrement());
        }
    }
}
