package ai;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.i20;
public final class j2 {
    public final i20 f1311a;
    public boolean f1313c;
    public volatile boolean d;
    public Thread f1314e;
    public final ConcurrentLinkedQueue f1312b = new ConcurrentLinkedQueue();
    public long f1315f = 1;

    public j2(i20 i20Var) {
        this.f1311a = i20Var;
    }

    public static boolean a() {
        if (!DictationAsr.G() || !mp.g1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
