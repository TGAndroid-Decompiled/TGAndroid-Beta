package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class l0 implements ThreadFactory {
    public final int f8371a;

    public l0(int i10) {
        this.f8371a = i10;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f8371a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "RoundVideoFiles");
            case 2:
                return new Thread(runnable, "RoundVideoOutput");
            case 3:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 4:
                return new Thread(runnable, "Lottie-" + yj0.P0.getAndIncrement());
            case 5:
                return new Thread(runnable, "LottieLow-" + yj0.Q0.getAndIncrement());
            case 6:
                return new Thread(runnable, "GramWalletStorage");
            case 7:
                return WalletEngine2.r(runnable);
            case 8:
                return new Thread(runnable, "AudioRecorderFiles");
            default:
                return new Thread(runnable, "AudioRecorderOutput");
        }
    }
}
