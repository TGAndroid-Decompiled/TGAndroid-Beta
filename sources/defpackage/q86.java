package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;
public final class q86 {
    public final l75 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public q86(l75 l75Var) {
        this.a = l75Var;
    }

    public static boolean a() {
        if (!DictationAsr.E() || !oc7.d1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
