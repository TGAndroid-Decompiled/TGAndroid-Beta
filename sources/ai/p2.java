package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.j20;
public final class p2 {
    public final j20 f1420a;
    public boolean f1422c;
    public volatile boolean d;
    public Thread f1423e;
    public final ConcurrentLinkedQueue f1421b = new ConcurrentLinkedQueue();
    public long f1424f = 1;

    public p2(j20 j20Var) {
        this.f1420a = j20Var;
    }

    public static boolean a() {
        if (!DictationAsr.B() || !mp.g1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
