package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public abstract class o2f {
    public static boolean a() {
        if (uc7.e1().getBoolean("asr_live_text", true) && DictationAsr.G()) {
            return true;
        }
        return false;
    }
}
