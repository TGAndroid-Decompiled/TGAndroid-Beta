package defpackage;

import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class vt2 implements Runnable {
    public final byte a;
    public final Runnable b;

    public vt2(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.lambda$cancelRequest$9(runnable);
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                ExecutorService executorService = DictationLid.a;
                DictationAsr.O();
                runnable.run();
                return;
            case 3:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                gm.r(runnable);
                gm.c3(runnable);
                return;
            case 5:
                gm.r(runnable);
                gm.c3(runnable);
                return;
            default:
                gm.r(runnable);
                gm.c3(runnable);
                return;
        }
    }
}
