package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class w0 implements Runnable {
    public final int f1562a;
    public final Runnable f1563b;

    public w0(int i7, Runnable runnable) {
        this.f1562a = i7;
        this.f1563b = runnable;
    }

    @Override
    public final void run() {
        int i7 = this.f1562a;
        Runnable runnable = this.f1563b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.f43150a;
                DictationAsr.P();
                runnable.run();
                return;
            case 1:
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.g3(runnable);
                return;
            case 2:
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.g3(runnable);
                return;
            case 3:
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.g3(runnable);
                return;
            case 4:
                ConnectionsManager.lambda$cancelRequest$9(runnable);
                return;
            default:
                runnable.run();
                return;
        }
    }
}
