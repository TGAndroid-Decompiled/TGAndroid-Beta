package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class l0 implements ThreadFactory {
    public final int f9685a;

    public l0(int i10) {
        this.f9685a = i10;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.f9685a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 2:
                return new Thread(runnable, "Lottie-" + yj0.P0.getAndIncrement());
            case 3:
                return new Thread(runnable, "LottieLow-" + yj0.Q0.getAndIncrement());
            case 4:
                Thread thread2 = new Thread(new t51(runnable, 13), "widget-sandbox-io");
                thread2.setDaemon(true);
                return thread2;
            case 5:
                return new Thread(runnable, "GramWalletStorage");
            case 6:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            case 7:
                return new Thread(runnable, "AudioRecorderFiles");
            case 8:
                return new Thread(runnable, "AudioRecorderOutput");
            case 9:
                return new Thread(runnable, "RoundVideoFiles");
            default:
                return new Thread(runnable, "RoundVideoOutput");
        }
    }
}
