package ai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.utils.twidget.WidgetEngineService;
public final class x0 implements ThreadFactory {
    public final int f1620a;

    public x0(int i7) {
        this.f1620a = i7;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.f1620a) {
            case 0:
                ExecutorService executorService = DictationLid.f42585a;
                return new Thread(new y0(0, runnable), "DictationLid");
            case 1:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
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
                String str = WidgetEngineService.f54152b;
                Thread thread = new Thread(runnable, "widget-engine-destroy");
                thread.setDaemon(true);
                return thread;
            case 7:
                Thread thread2 = new Thread(new org.telegram.utils.twidget.j0(runnable, 4), "widget-sandbox-io");
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
