package c8;

import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class c1 {
    public static boolean a() {
        if (np.g1().getBoolean("asr_live_text", true) && DictationAsr.C()) {
            return true;
        }
        return false;
    }
}
