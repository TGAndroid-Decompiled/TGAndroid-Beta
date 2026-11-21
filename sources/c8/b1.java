package c8;

import android.os.Build;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class b1 {
    public static boolean a() {
        if (mp.g1().getBoolean("design_voice_live_transcript", true) && DictationAsr.D()) {
            if (!DictationAsr.z() || (Build.VERSION.SDK_INT >= 33 && ai.d.i())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
