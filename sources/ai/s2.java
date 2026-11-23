package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.j20;
public final class s2 {
    public final j20 f1511a;
    public boolean f1513c;
    public volatile boolean d;
    public Thread f1514e;
    public final ConcurrentLinkedQueue f1512b = new ConcurrentLinkedQueue();
    public long f1515f = 1;

    public s2(j20 j20Var) {
        this.f1511a = j20Var;
    }

    public static boolean a() {
        if (!DictationAsr.D() || !np.g1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
