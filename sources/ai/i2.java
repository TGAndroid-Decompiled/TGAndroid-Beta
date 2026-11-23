package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.j20;
public final class i2 {
    public final j20 f1294a;
    public boolean f1296c;
    public volatile boolean d;
    public Thread f1297e;
    public final ConcurrentLinkedQueue f1295b = new ConcurrentLinkedQueue();
    public long f1298f = 1;

    public i2(j20 j20Var) {
        this.f1294a = j20Var;
    }

    public static boolean a() {
        if (!DictationAsr.C() || !np.g1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
