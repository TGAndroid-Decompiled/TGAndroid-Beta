package g2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class m0 implements ThreadFactory {
    public final int f11872a;

    public m0(int i3) {
        this.f11872a = i3;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.f11872a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 2:
                return new Thread(runnable, "Lottie-" + ch0.Q0.getAndIncrement());
            case 3:
                return new Thread(runnable, "LottieLow-" + ch0.R0.getAndIncrement());
            case 4:
                return new Thread(runnable, "GramWalletStorage");
            case 5:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            case 6:
                Thread thread2 = new Thread(new org.telegram.utils.twidget.l(runnable, 3), "widget-sandbox-io");
                thread2.setDaemon(true);
                return thread2;
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
