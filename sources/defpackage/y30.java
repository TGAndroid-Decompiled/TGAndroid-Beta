package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.utils.twidget.WidgetEngineService;
public final class y30 implements ThreadFactory {
    public final byte a;

    public y30(byte b) {
        this.a = b;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.a) {
            case 0:
                return new Thread(runnable, "AudioRecorderFiles");
            case 1:
                return new Thread(runnable, "AudioRecorderOutput");
            case 2:
                ExecutorService executorService = DictationLid.a;
                return new Thread(new vt2(runnable, (byte) 2), "DictationLid");
            case 3:
                return new Thread(runnable, "GramWalletStorage");
            case 4:
                Thread thread = new Thread(runnable, "PrismaHighlight");
                thread.setDaemon(true);
                return thread;
            case 5:
                return new Thread(runnable, "Lottie-" + p09.Q0.getAndIncrement());
            case 6:
                return new Thread(runnable, "LottieLow-" + p09.R0.getAndIncrement());
            case 7:
                return new Thread(runnable, "RoundVideoFiles");
            case 8:
                return new Thread(runnable, "RoundVideoOutput");
            case 9:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 10:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
            case 11:
                String str = WidgetEngineService.b;
                Thread thread2 = new Thread(runnable, "widget-engine-destroy");
                thread2.setDaemon(true);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable, "widget-sandbox-io");
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
