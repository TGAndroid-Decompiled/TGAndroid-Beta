package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;
public final class q66 {
    public final n55 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public q66(n55 n55Var) {
        this.a = n55Var;
    }

    public static boolean a() {
        if (!DictationAsr.E() || !na7.c1().getBoolean("asr_live_captions", false)) {
            return false;
        }
        return true;
    }
}
