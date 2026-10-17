package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class l0 implements ThreadFactory {
    public final int f8253a;

    public l0(int i10) {
        this.f8253a = i10;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f8253a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 2:
                return new Thread(runnable, "Lottie-" + uj0.P0.getAndIncrement());
            case 3:
                return new Thread(runnable, "LottieLow-" + uj0.Q0.getAndIncrement());
            case 4:
                return new Thread(runnable, "GramWalletStorage");
            case 5:
                return WalletEngine2.r(runnable);
            case 6:
                return new Thread(runnable, "AudioRecorderFiles");
            case 7:
                return new Thread(runnable, "AudioRecorderOutput");
            case 8:
                return new Thread(runnable, "RoundVideoFiles");
            default:
                return new Thread(runnable, "RoundVideoOutput");
        }
    }
}
