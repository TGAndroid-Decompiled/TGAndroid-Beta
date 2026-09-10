package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.hj0;
public final class c0 implements ThreadFactory {
    public final int f7187a;

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f7187a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "Lottie-" + hj0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + hj0.Q0.getAndIncrement());
        }
    }
}
