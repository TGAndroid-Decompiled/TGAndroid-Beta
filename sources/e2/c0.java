package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class c0 implements ThreadFactory {
    public final int f8530a;

    public c0(int i10) {
        this.f8530a = i10;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f8530a) {
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
                return new Thread(runnable, "Lottie-" + dk0.P0.getAndIncrement());
            case 5:
                return new Thread(runnable, "LottieLow-" + dk0.Q0.getAndIncrement());
            case 6:
                return new Thread(runnable, "GramWalletStorage");
            default:
                return WalletEngine2.r(runnable);
        }
    }
}
