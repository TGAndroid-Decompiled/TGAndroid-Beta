package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.yi0;
public final class c0 implements ThreadFactory {
    public final int f7870a;

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f7870a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "Lottie-" + yi0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + yi0.Q0.getAndIncrement());
        }
    }
}
