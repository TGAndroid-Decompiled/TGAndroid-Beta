package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;
public final class u86 {
    public final p75 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public u86(p75 p75Var) {
        this.a = p75Var;
    }

    public static boolean a() {
        if (!DictationAsr.G() || !uc7.e1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
