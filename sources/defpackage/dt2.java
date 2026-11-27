package defpackage;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class dt2 implements Runnable {
    public final byte a;
    public final Runnable b;

    public dt2(Runnable runnable, byte b) {
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
                DictationAsr.Q();
                runnable.run();
                return;
            case 3:
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                OpusDred.lambda$whenReadyForGroupCall$2(runnable);
                return;
            case 5:
                hl.r(runnable);
                hl.c3(runnable);
                return;
            case 6:
                hl.r(runnable);
                hl.c3(runnable);
                return;
            default:
                hl.r(runnable);
                hl.c3(runnable);
                return;
        }
    }
}
