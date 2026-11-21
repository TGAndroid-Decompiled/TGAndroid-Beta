package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.j20;
public final class r2 {
    public final j20 f1445a;
    public boolean f1447c;
    public volatile boolean d;
    public Thread f1448e;
    public final ConcurrentLinkedQueue f1446b = new ConcurrentLinkedQueue();
    public long f1449f = 1;

    public r2(j20 j20Var) {
        this.f1445a = j20Var;
    }

    public static boolean a() {
        if (!DictationAsr.D() || !mp.g1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
