package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.g20;
public final class o2 {
    public final g20 f1422a;
    public boolean f1424c;
    public volatile boolean d;
    public Thread f1425e;
    public final ConcurrentLinkedQueue f1423b = new ConcurrentLinkedQueue();
    public long f1426f = 1;

    public o2(g20 g20Var) {
        this.f1422a = g20Var;
    }

    public static boolean a() {
        if (!DictationAsr.B() || !np.e1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
