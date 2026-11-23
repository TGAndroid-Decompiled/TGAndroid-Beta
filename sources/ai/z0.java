package ai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.utils.twidget.WidgetEngineService;
public final class z0 implements ThreadFactory {
    public final int f1643a;

    public z0(int i7) {
        this.f1643a = i7;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.f1643a) {
            case 0:
                ExecutorService executorService = DictationLid.f43074a;
                return new Thread(new a1(0, runnable), "DictationLid");
            case 1:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 2:
                return new Thread(runnable, "Lottie-" + oh0.Q0.getAndIncrement());
            case 3:
                return new Thread(runnable, "LottieLow-" + oh0.R0.getAndIncrement());
            case 4:
                return new Thread(runnable, "GramWalletStorage");
            case 5:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            case 6:
                String str = WidgetEngineService.f54716b;
                Thread thread = new Thread(runnable, "widget-engine-destroy");
                thread.setDaemon(true);
                return thread;
            case 7:
                Thread thread2 = new Thread(runnable, "widget-sandbox-io");
                thread2.setDaemon(true);
                return thread2;
            case 8:
                Thread thread3 = new Thread(runnable, "PrismaHighlight");
                thread3.setDaemon(true);
                return thread3;
            case 9:
                return new Thread(runnable, "AudioRecorderFiles");
            case 10:
                return new Thread(runnable, "AudioRecorderOutput");
            case 11:
                return new Thread(runnable, "RoundVideoFiles");
            default:
                return new Thread(runnable, "RoundVideoOutput");
        }
    }
}
