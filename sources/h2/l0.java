package h2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.utils.twidget.WidgetEngineService;
public final class l0 implements ThreadFactory {
    public final int f14111a;

    public l0(int i7) {
        this.f14111a = i7;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.f14111a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 2:
                return new Thread(runnable, "Lottie-" + ah0.P0.getAndIncrement());
            case 3:
                return new Thread(runnable, "LottieLow-" + ah0.Q0.getAndIncrement());
            case 4:
                return new Thread(runnable, "GramWalletStorage");
            case 5:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            case 6:
                String str = WidgetEngineService.f52760b;
                Thread thread2 = new Thread(runnable, "widget-engine-destroy");
                thread2.setDaemon(true);
                return thread2;
            case 7:
                Thread thread3 = new Thread(new org.telegram.utils.twidget.j0(runnable, 4), "widget-sandbox-io");
                thread3.setDaemon(true);
                return thread3;
            case 8:
                return new Thread(runnable, "AudioRecorderFiles");
            case 9:
                return new Thread(runnable, "AudioRecorderOutput");
            case 10:
                return new Thread(runnable, "RoundVideoFiles");
            default:
                return new Thread(runnable, "RoundVideoOutput");
        }
    }
}
