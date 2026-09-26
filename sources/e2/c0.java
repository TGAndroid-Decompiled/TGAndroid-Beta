package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.jj0;
public final class c0 implements ThreadFactory {
    public final int f7869a;

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f7869a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "RoundVideoFiles");
            case 2:
                return new Thread(runnable, "RoundVideoOutput");
            case 3:
                return new Thread(runnable, "Lottie-" + jj0.P0.getAndIncrement());
            default:
                return new Thread(runnable, "LottieLow-" + jj0.Q0.getAndIncrement());
        }
    }
}
