package defpackage;

import org.telegram.ui.Dictation.DictationAsr;
public abstract class wxe {
    public static boolean a() {
        if (na7.c1().getBoolean("asr_live_text", true) && DictationAsr.E()) {
            return true;
        }
        return false;
    }
}
