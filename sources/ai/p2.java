package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.g20;
public final class p2 {
    public final g20 f1429a;
    public boolean f1431c;
    public volatile boolean d;
    public Thread f1432e;
    public final ConcurrentLinkedQueue f1430b = new ConcurrentLinkedQueue();
    public long f1433f = 1;

    public p2(g20 g20Var) {
        this.f1429a = g20Var;
    }

    public static boolean a() {
        if (!DictationAsr.B() || !np.e1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
