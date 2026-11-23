package c8;

import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class c1 {
    public static boolean a() {
        if (mp.g1().getBoolean("asr_live_text", true) && DictationAsr.G()) {
            return true;
        }
        return false;
    }
}
